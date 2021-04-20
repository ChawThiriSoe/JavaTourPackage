package TourPackage;

public class OperatorClass extends Person{
	int oid;
	String opwd;
	
	public OperatorClass(String pname, String pdob, String pnrc, String pgender, String pphno, String pemail,
			String paddress, int oid, String opwd) {
		super(pname, pdob, pnrc, pgender, pphno, pemail, paddress);
		this.oid = oid;
		this.opwd = opwd;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOpwd() {
		return opwd;
	}
	public void setOpwd(String opwd) {
		this.opwd = opwd;
	}
	
}
