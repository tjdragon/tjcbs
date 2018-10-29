package tjcbs.payload;

public class PSimpleLoan {
	public final String nino;
	public final String casaId;
	public final int fromDate;
	public final double principal;
	public final double interest;
	public int numberOfInstallments;
	public final String paymentSchedule;
	
	public PSimpleLoan(String nino, String casaId, int fromDate, double principal, double interest,
			int numberOfInstallments, String paymentSchedule) {
		super();
		this.nino = nino;
		this.casaId = casaId;
		this.fromDate = fromDate;
		this.principal = principal;
		this.interest = interest;
		this.numberOfInstallments = numberOfInstallments;
		this.paymentSchedule = paymentSchedule;
	}
}
