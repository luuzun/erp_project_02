package dto;

public class Title {
	private int tcode;
	private String tname;

	public Title() {}

	public Title(int tcode, String tname) {
		this.tcode = tcode;
		this.tname = tname;
	}

	public Object[] toArrayForTable() {
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", tcode, tname);
	}

	public int getTcode() {
		return tcode;
	}
	public void setTcode(int tcode) {
		this.tcode = tcode;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
}
