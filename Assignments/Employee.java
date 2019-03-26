package com.Assignments;

public class Employee {
	private String fname;
	private String lname;
	private long mobile;
	private String email;
	private String address;
	public Employee(String fname, String lname, long mobile, String email, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public long getMobile() {
		return mobile;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	

}
