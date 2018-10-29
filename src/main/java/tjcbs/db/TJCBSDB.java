package tjcbs.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.Configuration;
import org.jooq.Record;
import org.jooq.Record2;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tjcbs.jooq.db.tables.daos.CbsAccountDao;
import tjcbs.jooq.db.tables.daos.CbsCustomerDao;
import tjcbs.jooq.db.tables.daos.CbsInfoDao;
import tjcbs.jooq.db.tables.daos.CbsSavingsAccountDao;
import tjcbs.jooq.db.tables.daos.CbsSavingsAccountLimitDao;
import tjcbs.jooq.db.tables.daos.CbsSavingsTransactionsDao;
import tjcbs.jooq.db.tables.daos.CbsSimpleLoanDao;
import tjcbs.jooq.db.tables.daos.CbsSimpleLoanPaymentScheduleDao;
import tjcbs.jooq.db.tables.pojos.CbsAccount;
import tjcbs.jooq.db.tables.pojos.CbsCustomer;
import tjcbs.jooq.db.tables.pojos.CbsInfo;
import tjcbs.jooq.db.tables.pojos.CbsSavingsAccount;
import tjcbs.jooq.db.tables.pojos.CbsSavingsAccountLimit;
import tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions;
import tjcbs.jooq.db.tables.pojos.CbsSimpleLoan;
import tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule;
import tjcbs.loan.LoanPaymentStatus;
import tjcbs.loan.LoanStatus;

public class TJCBSDB {
	private static final Logger log = LoggerFactory.getLogger(TJCBSDB.class);
	public static final String DB_URL = "jdbc:derby://localhost:1527/C:/Users/1464658/_dev/runtime/local/CBS/TJCBSDB;create=true";
	
	private Connection getConnection() throws Exception {
		log.debug("getConnection()");
		
		return DriverManager.getConnection(DB_URL);
	}
	
	public void persistCBSInfo(final String partnerId, final int version) throws Exception {
		// https://www.jooq.org/doc/3.11/manual/sql-execution/daos/
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsInfoDao(configuration).insert(new CbsInfo(partnerId, version));
		}
	}
	
	public void persistCustomerInfo(final String nino, 
			                        final String firstName, 
			                        final String lastName, 
			                        final int dob, 
			                        final String primaryEmail) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsCustomerDao(configuration).insert(new CbsCustomer(nino, firstName, lastName, dob, primaryEmail));
		}
	}
	
	public void persistCASA(final String id,
			                final String nino,
			                final String name,
			                final String ccy,
			                final double balance,
			                final double interest) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSavingsAccountDao(configuration).insert(new CbsSavingsAccount(id, nino, name, ccy, balance, interest));
		}
	}
	
	public void persistCASAOverdraft(final String id,
			                         final String nino,
			                         final int maximumOverdraft) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSavingsAccountLimitDao(configuration).insert(new CbsSavingsAccountLimit(id, nino, maximumOverdraft));
		}
	}
	
	public void persistCASATransaction(final String id,
			                           final String nino,
			                           final String txId,
			                           final String label,
			                           final int txDate,
			                           final int txTime,
			                           final double amount) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSavingsTransactionsDao(configuration).insert(new CbsSavingsTransactions(id, nino, txId, label, txDate, txTime, amount));
		}
	}
	
	public void updateBalance(final String id,
			                  final String nino,
			                  final double offset) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			final tjcbs.jooq.db.tables.CbsSavingsAccount table = tjcbs.jooq.db.tables.CbsSavingsAccount.CBS_SAVINGS_ACCOUNT;
			final Record pk = DSL.using(configuration).newRecord(table.ID, table.NINO).values(id, nino);
			@SuppressWarnings("unchecked")
			final CbsSavingsAccount cbsAccount = new CbsSavingsAccountDao(configuration).findById((Record2<String,String>)pk);
			final double currentBalance = cbsAccount.getBalance();
			final double newBalance = currentBalance + offset;
			cbsAccount.setBalance(newBalance);
			new CbsSavingsAccountDao(configuration).update(cbsAccount);
		}
	}
	
	public void persistSimpleLoan(final String id,
			                      final String nino,
			                      final String casaId,
			                      final int fromDate,
			                      final int toDate,
			                      final double principal,
			                      final double interest,
			                      final int installements,
			                      final String paymentDue,
			                      final String status) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSimpleLoanDao(configuration).insert(new CbsSimpleLoan(id, nino, casaId, fromDate, toDate, principal, interest, installements, paymentDue, status));
		}
	}
	
	public void persistSimpleLoanSchedule(final String id,
			                              final String loanId,
			                              final String nino,
			                              final String casaId,
			                              final double amountDue,
			                              final double principalDue,
			                              final double interestDue,
			                              final int atDate,
			                              final String status) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSimpleLoanPaymentScheduleDao(configuration).insert(new CbsSimpleLoanPaymentSchedule(id, loanId, nino, casaId, amountDue, principalDue, interestDue, atDate, status));
		}
	}
	
	public void updateSimpleLoanSchedule(final CbsSimpleLoanPaymentSchedule schedule) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSimpleLoanPaymentScheduleDao(configuration).update(schedule);
		}
	}
	
	public List<CbsSimpleLoan> findLoansByDate(final int date) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			final List<CbsSimpleLoan> newLoans = 
					new CbsSimpleLoanDao(configuration).findAll()
					                                     .stream()
					                                     .filter(l -> l.getFromDate() <= date && l.getStatus().equals(LoanStatus.NEW.name()))
					                                     .collect(Collectors.toList());
			return newLoans;
		}
	}
	
	public final List<CbsSavingsAccount> findAllSavingsAccount() throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			final List<CbsSavingsAccount> savingsAccounts = new CbsSavingsAccountDao(configuration).findAll();
			return savingsAccounts;
		}
	}
	
	public void update(final CbsSimpleLoan loan) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsSimpleLoanDao(configuration).update(loan);
		}
	}
	
	public List<CbsSimpleLoanPaymentSchedule> findPaymentSchedules(final int date) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			final List<CbsSimpleLoanPaymentSchedule> schedules = 
					new CbsSimpleLoanPaymentScheduleDao(configuration).findAll()
					                                                    .stream()
					                                                    .filter(p -> p.getAtDate() <= date && p.getStatus().equals(LoanPaymentStatus.PENDING.name()))
					                                                    .collect(Collectors.toList());
			return schedules;                                        
		}
	}
	
	public void persistCBSAccount(final String id, 
			                        final double allocatedAmount,
			                        final double currentAmount) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			new CbsAccountDao(configuration).insert(new CbsAccount(id, allocatedAmount, currentAmount));
		}
	}
	
	public void updateCBSAccount(final String id, final double offset) throws Exception {
		try(Connection c = getConnection()) {
			final Configuration configuration = new DefaultConfiguration().set(c).set(SQLDialect.DERBY);
			final CbsAccount cbsAccount = new CbsAccountDao(configuration).findById(id);
			cbsAccount.setCurrentAmount(cbsAccount.getCurrentAmount() + offset);
			new CbsAccountDao(configuration).update(cbsAccount);
		}
	}
}
