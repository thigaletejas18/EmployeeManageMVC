package model;

public class EmployeePojo {
    private int eid;
    private String name;
    private int contact;
    private int salary;
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeePojo(int eid, String name, int contact, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
}
