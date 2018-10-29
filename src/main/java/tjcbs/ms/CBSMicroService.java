package tjcbs.ms;

import static spark.Spark.port;
import static spark.Spark.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tjcbs.db.TJCBSDB;
import tjcbs.loan.SimpleLoanManager;
import tjcbs.payload.PCustomerInfo;
import tjcbs.payload.PCBSAccount;
import tjcbs.payload.PInfo;
import tjcbs.payload.PSavingsAccount;
import tjcbs.payload.PSavingsTransaction;
import tjcbs.payload.PSimpleLoan;
import tjcbs.utils.CBSUtils;

public class CBSMicroService {
	private static final Logger log = LoggerFactory.getLogger(CBSMicroService.class);
	
	public static void main(String[] args) {
		port(9999);
		
		log.info("curl -X POST -d@cbs_version.json http://localhost:9999/set-version");
        post("/set-version", (req, res) -> {
        	log.info("Sets Version");
        	final PInfo payload = CBSUtils.fromJSON(req.body(), PInfo.class);
        	new TJCBSDB().persistCBSInfo(payload.partnerId, payload.version);
        	return "OK";
        });
        
        log.info("curl -X POST -d@cbs_customer.json http://localhost:9999/create-customer");
        post("/create-customer", (req, res) -> {
        	log.info("Creates Customer");
        	final PCustomerInfo payload = CBSUtils.fromJSON(req.body(), PCustomerInfo.class);
        	new TJCBSDB().persistCustomerInfo(payload.nino, payload.firstName, payload.lastName, payload.dob, payload.primaryEmail);
        	return "OK";
        });
        
        log.info("curl -X POST -d@cbs_casa.json http://localhost:9999/create-casa");
        post("/create-casa", (req, res) -> {
        	log.info("Creates CASA");
        	final PSavingsAccount payload = CBSUtils.fromJSON(req.body(), PSavingsAccount.class);
        	final String id = CBSUtils.uuid();
        	new TJCBSDB().persistCASA(id, payload.nino, payload.name,  payload.ccy, 0.0, payload.interest);
        	new TJCBSDB().persistCASAOverdraft(id, payload.nino, 1000);
        	return "OK " + id;
        });
        
        log.info("curl -X POST -d@cbs_casa_tx.json http://localhost:9999/create-casa-tx");
        post("/create-casa-tx", (req, res) -> {
        	log.info("Creates CASA Transactions");
        	final PSavingsTransaction payload = CBSUtils.fromJSON(req.body(), PSavingsTransaction.class);
        	new TJCBSDB().persistCASATransaction(payload.id, payload.nino, payload.txId, payload.label, payload.txDate, payload.txTime, payload.amount);
        	new TJCBSDB().updateBalance(payload.id, payload.nino, payload.amount);
        	return "OK";
        });
        
        log.info("curl -X POST -d@cbs_simple_loan.json http://localhost:9999/create-simple-loan");
        post("/create-simple-loan", (req, res) -> {
        	log.info("Creates Simple loan");
        	final PSimpleLoan payload = CBSUtils.fromJSON(req.body(), PSimpleLoan.class);
        	new SimpleLoanManager().handleNewLoan(payload);
        	return "OK";
        });
        
        log.info("curl -X POST -d@cbs_account.json http://localhost:9999/create-cbs-account");
        post("/create-cbs-account", (req, res) -> {
        	log.info("Creates Account");
        	final PCBSAccount payload = CBSUtils.fromJSON(req.body(), PCBSAccount.class);
        	new TJCBSDB().persistCBSAccount(payload.id, payload.allocatedAmount, payload.currentAmount);
        	return "OK";
        });
	}
}
