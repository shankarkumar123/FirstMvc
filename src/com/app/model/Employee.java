package com.app.model;

public class Employee {
	private String uname;
	private String upass;
	public Employee() {
		super();
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "Employee [uname=" + uname + ", upass=" + upass + "]";
	}
	

}
