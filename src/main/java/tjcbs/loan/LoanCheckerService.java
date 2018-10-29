package tjcbs.loan;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tjcbs.db.TJCBSDB;
import tjcbs.jooq.db.tables.pojos.CbsSimpleLoan;
import tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule;
import tjcbs.utils.CBSUtils;

/**
 * LoanChecerService
 * 
 * - Takes in a date like 20181019
 * - Goes throw the loans payment schedule and update the statues and transfers when needed
 */
public class LoanCheckerService {
	private static final Logger log = LoggerFactory.getLogger(LoanCheckerService.class);
	
	private final int forDate;
	
	public LoanCheckerService(final int forDate) {
		log.info("LoanCheckerService {}", forDate);
		this.forDate = forDate;
	}
	
	void execute() throws Exception {
		log.info("execute()");
		
		final int currentDate = Integer.parseInt(CBSUtils.format(LocalDate.now(), "yyyyMMdd"));
		log.info("Current date {} for date {}", currentDate, forDate);
		
		final List<CbsSimpleLoan> newLoans = new TJCBSDB().findLoansByDate(forDate);
		log.info("Found {} loans", newLoans.size());
		newLoans.forEach(l -> {
			log.info("Processing loan {}", l);
			l.setStatus(LoanStatus.INFLIGHT.name());
			try {
				log.info("Updating {} to INFLIGHT", l);
				new TJCBSDB().update(l);
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		});
		
		List<CbsSimpleLoanPaymentSchedule> schedules = new TJCBSDB().findPaymentSchedules(forDate);
		log.info("Found {} schedules", schedules.size());
		schedules.forEach(s -> {
			log.info("Processing payment schedule {}", s);
			final String txId = CBSUtils.uuid();
			final int now = CBSUtils.getTimeNow();
			try {
				final double amount = -s.getAmountDue();
				new TJCBSDB().persistCASATransaction(s.getCasaId(), s.getNino(), txId, "Loan Repayment", currentDate, now, amount);
				new TJCBSDB().updateBalance(s.getCasaId(), s.getNino(), amount);
				new TJCBSDB().updateCBSAccount("BUPA", s.getInterestDue());
				s.setStatus(LoanPaymentStatus.PAID.name());
				new TJCBSDB().updateSimpleLoanSchedule(s);
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		});
	}

	public static void main(String[] args) throws Exception {
		new LoanCheckerService(Integer.parseInt(args[0])).execute();
	}
}
