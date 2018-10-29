package tjcbs.payload;

public class PSavingsTransaction {
	public final String id;
	public final String nino;
	public final String txId;
	public final String label;
	public final int txDate;
	public final int txTime;
	public final double amount;
	
	public PSavingsTransaction(String id, String nino, String txId, String label, int txDate, int txTime,
			double amount) {
		super();
		this.id = id;
		this.nino = nino;
		this.txId = txId;
		this.label = label;
		this.txDate = txDate;
		this.txTime = txTime;
		this.amount = amount;
	}
}
