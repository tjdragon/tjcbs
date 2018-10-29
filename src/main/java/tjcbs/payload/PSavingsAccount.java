package tjcbs.payload;

public class PSavingsAccount {
	public String id = null;
	public final String nino;
	public final String name;
	public final String ccy;
	public final double interest;
	
	public PSavingsAccount(String nino, String name, final String ccy, final double interest) {
		this.nino = nino;
		this.name = name;
		this.ccy = ccy;
		this.interest = interest;
	}
}
