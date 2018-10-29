package tjcbs.casa;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tjcbs.db.TJCBSDB;
import tjcbs.jooq.db.tables.pojos.CbsSavingsAccount;
import tjcbs.loan.LoanCheckerService;
import tjcbs.utils.CBSUtils;

public class InterestPayerService {
	private static final Logger log = LoggerFactory.getLogger(LoanCheckerService.class);
	
	private final int forDate;
	
	public InterestPayerService(final int forDate) {
		log.info("InterestPayerService {}", forDate);
		this.forDate = forDate;
	}
	
	public void execute() throws Exception {
		log.info("execute for {}", forDate);
		
		// Get the current account level
		// Calculate the one year compound-interest
		// Divide by 365 days
		// Make payment
		
		final List<CbsSavingsAccount> accounts = new TJCBSDB().findAllSavingsAccount()
				                                                .stream()
				                                                .filter(a -> a.getBalance() > 0)
				                                                .collect(Collectors.toList());
		accounts.forEach(a -> {
			final double ir = a.getInterest();
			final double b = a.getBalance();
			// Simulate compound interest
			final double ip = b * (1.0 + ir / 100.0 / 365.0) - b;
			final double rip = CBSUtils.round(ip, 2);
			log.info("Interest earned daily {}, for 1 year {}, daily rounded {}", ip, ip * 365.0, rip);
			
			try {
				new TJCBSDB().persistCASATransaction(a.getId(), a.getNino(), CBSUtils.uuid(), "Interest payment", forDate, CBSUtils.getTimeNow(), rip);
				new TJCBSDB().updateBalance(a.getId(), a.getNino(), rip);
				new TJCBSDB().updateCBSAccount("BUPA", -rip);
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		});
	}
	
	public static void main(String[] args) throws Exception {
		new InterestPayerService(Integer.parseInt(args[0])).execute();
	}
}
