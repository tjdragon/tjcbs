package tjcbs.payload;

public class PCBSAccount {
	public final String id;
	public final double allocatedAmount;
	public final double currentAmount;
	
	public PCBSAccount(String id, double allocatedAmount, double currentAmount) {
		this.id = id;
		this.allocatedAmount = allocatedAmount;
		this.currentAmount = currentAmount;
	}
}
