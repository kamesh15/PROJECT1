package com.reimbursement.model;

public class EmployeeDetails {

	private String employeeId;
	private String password;
	private String firstname;
	private String lastname;
	private String designation;
	private String department;
	private String emailid;
	private String phoneno;
	private String type;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", designation=" + designation + ", department=" + department
				+ ", emailid=" + emailid + ", phoneno=" + phoneno + ", type=" + type + "]";
	}
	
	
	}

	/*public EmployeeDetails(Integer employeeId, String password, String firstname, String lastname, String designation,
			String department, String emailid, String type) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.department = department;
		this.emailid = emailid;
		this.type = type;
	}*/
	
	
