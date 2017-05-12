package dto;

public class Department {
	private int dcode;
	private String dname;
	private int floor;
	
	public Department() {}

	public Department(int dcode, String dname, int floor) {
		this.dcode = dcode;
		this.dname = dname;
		this.floor = floor;
	}

	public Object[] toArrayForTable() {
		return null;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s", dcode, dname, floor);
	}

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
}