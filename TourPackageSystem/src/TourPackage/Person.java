package TourPackage;

public class Person {
	String pname;
	String pdob;
	String pnrc;
	String pgender;
	String pphno;
	String pemail;
	String paddress;
	
	public Person(String pname, String pdob, String pnrc, String pgender, String pphno, String pemail,
			String paddress) {
		super();
		this.pname = pname;
		this.pdob = pdob;
		this.pnrc = pnrc;
		this.pgender = pgender;
		this.pphno = pphno;
		this.pemail = pemail;
		this.paddress = paddress;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdob() {
		return pdob;
	}

	public void setPdob(String pdob) {
		this.pdob = pdob;
	}

	public String getPnrc() {
		return pnrc;
	}

	public void setPnrc(String pnrc) {
		this.pnrc = pnrc;
	}

	public String getPgender() {
		return pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	public String getPphno() {
		return pphno;
	}

	public void setPphno(String pphno) {
		this.pphno = pphno;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
}
