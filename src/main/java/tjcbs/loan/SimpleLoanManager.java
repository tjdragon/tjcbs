package tjcbs.loan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tjcbs.db.TJCBSDB;
import tjcbs.payload.PSimpleLoan;
import tjcbs.utils.CBSUtils;

public class SimpleLoanManager {
	private static final Logger log = LoggerFactory.getLogger(SimpleLoanManager.class);
	
	public SimpleLoanManager() {
		log.debug("SimpleLoanManager()");
	}
	
	// Persist loan - calculate schedules, etc. 
	// Assume interest + principal
	public void handleNewLoan(final PSimpleLoan simpleLoan) throws Exception {
		log.info("handleNewLoan {}", simpleLoan);
		
		final double totalInterestDue = simpleLoan.principal * simpleLoan.interest / 100.0;
		final double totalAmountDue = simpleLoan.principal + totalInterestDue;
		final double scheduledInterestDue = CBSUtils.round(totalInterestDue / simpleLoan.numberOfInstallments, 2);
		final double scheduledPrincipalDue = CBSUtils.round(simpleLoan.principal / simpleLoan.numberOfInstallments, 2);
		log.info("Total Interest Due {} Total Amount due {}", totalInterestDue, totalAmountDue);
		log.info("Total Scheduled Due {} Total Scheduled due {}", scheduledInterestDue, scheduledPrincipalDue);
		
		if (simpleLoan.numberOfInstallments > 1) {
			final List<ScheduledPayment> schedules = new LinkedList<>();
			
			final LocalDate from = LocalDate.parse(""+simpleLoan.fromDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
			final ScheduledPayment sp0 = new ScheduledPayment(from, totalAmountDue, totalInterestDue, scheduledPrincipalDue, scheduledInterestDue);
			schedules.add(sp0);
			log.info(sp0.toString());
			
			int lastDate = -1;
			for(int i = 1; i < simpleLoan.numberOfInstallments; i++) {
				final LocalDate next = from.plus(i, ChronoUnit.valueOf(simpleLoan.paymentSchedule));
				lastDate = Integer.parseInt(CBSUtils.format(next, "yyyyMMdd"));
				final ScheduledPayment sp = new ScheduledPayment(next, totalAmountDue, totalInterestDue, scheduledPrincipalDue, scheduledInterestDue);
				schedules.add(sp);
				log.info(sp.toString());
			}
			
			final String loanId = CBSUtils.uuid();
			new TJCBSDB().persistSimpleLoan(loanId, simpleLoan.nino, simpleLoan.casaId, simpleLoan.fromDate, lastDate, simpleLoan.principal, simpleLoan.interest, simpleLoan.numberOfInstallments, simpleLoan.paymentSchedule, LoanStatus.NEW.name());
			schedules.forEach(s -> {
				try {
					new TJCBSDB().persistSimpleLoanSchedule(s.id, loanId, simpleLoan.nino, simpleLoan.casaId, s.scheduledAmountDue + s.scheduledInterestDue, s.scheduledAmountDue, s.scheduledInterestDue, s.atDate(), LoanPaymentStatus.PENDING.name());
				} catch (Exception e) {
					log.error(e.getMessage(), e);
				}
			});
		} else {
			// Buy now - pay later - one installment 
			log.info("Buy now pay later");
			final String loanId = CBSUtils.uuid();
			final LocalDate from = LocalDate.parse(""+simpleLoan.fromDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
			final ScheduledPayment sp0 = new ScheduledPayment(from, totalAmountDue, totalInterestDue, scheduledPrincipalDue, scheduledInterestDue);
			final LocalDate next = from.plus(1, ChronoUnit.valueOf(simpleLoan.paymentSchedule));
			final int lastDate = Integer.parseInt(CBSUtils.format(next, "yyyyMMdd"));
			try {
				new TJCBSDB().persistSimpleLoan(loanId, simpleLoan.nino, simpleLoan.casaId, simpleLoan.fromDate, lastDate, simpleLoan.principal, simpleLoan.interest, simpleLoan.numberOfInstallments, simpleLoan.paymentSchedule, LoanStatus.NEW.name());
				new TJCBSDB().persistSimpleLoanSchedule(sp0.id, loanId, simpleLoan.nino, simpleLoan.casaId, sp0.scheduledAmountDue+sp0.scheduledInterestDue, sp0.scheduledAmountDue, sp0.scheduledInterestDue, lastDate, LoanPaymentStatus.PENDING.name());
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		}
	} // handleNewLoan
}

class ScheduledPayment {
	public final String id = CBSUtils.uuid();
	public final LocalDate paymentDate;
	public final double totalAmountDue;
	public final double totalInterestDue;
	public final double scheduledAmountDue;
	public final double scheduledInterestDue;
	
	public ScheduledPayment(LocalDate paymentDate, double totalAmountDue, double totalInterestDue,
			double scheduledAmountDue, double scheduledInterestDue) {
		super();
		this.paymentDate = paymentDate;
		this.totalAmountDue = totalAmountDue;
		this.totalInterestDue = totalInterestDue;
		this.scheduledAmountDue = scheduledAmountDue;
		this.scheduledInterestDue = scheduledInterestDue;
	}

	public int atDate() {
		return Integer.parseInt(CBSUtils.format(paymentDate, "yyyyMMdd"));
	}

	@Override
	public String toString() {
		return "ScheduledPayment [id=" + id + ", paymentDate=" + paymentDate + ", totalAmountDue=" + totalAmountDue
				+ ", totalInterestDue=" + totalInterestDue + ", scheduledAmountDue=" + scheduledAmountDue
				+ ", scheduledInterestDue=" + scheduledInterestDue + "]";
	}
}
