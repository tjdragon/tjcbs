package tjcbs.payload;

public final class PCustomerInfo {
	public final String nino;
	public final String firstName;
	public final String lastName;
	public final int dob;
	public final String primaryEmail;
	
	public PCustomerInfo(String nino, String firstName, String lastName, int dob, String primaryEmail) {
		super();
		this.nino = nino;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.primaryEmail = primaryEmail;
	}
}
