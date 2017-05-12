package dto;

public class Employee {
	private int eno;
	private String ename;
	private int salary;
	private Department department;
	private boolean gender;
	private String joinDate;
	private Title title;

	public Employee() {}

	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public Employee(int eno) {
		this.eno = eno;
	}

	public Employee(int eno, String ename, int salary, Department department, boolean gender, String joinDate,
			Title title) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
		this.joinDate = joinDate;
		this.title = title;
	}

	public Object[] toArrayForTable() {
		return null;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s, %s",
				eno, ename, salary, department, gender, joinDate, title);
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}