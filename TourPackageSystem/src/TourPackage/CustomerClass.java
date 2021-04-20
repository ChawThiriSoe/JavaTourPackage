package TourPackage;

public class CustomerClass extends Person{
	int cid;
	String cpwd;
	
	public CustomerClass(String pname, String pdob, String pnrc, String pgender, String pphno, String pemail,
			String paddress, int cid, String cpwd) {
		super(pname, pdob, pnrc, pgender, pphno, pemail, paddress);
		this.cid = cid;
		this.cpwd = cpwd;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCpassword() {
		return cpwd;
	}
	public void setCpassword(String cpwd) {
		this.cpwd = cpwd;
	}
	
	
}
