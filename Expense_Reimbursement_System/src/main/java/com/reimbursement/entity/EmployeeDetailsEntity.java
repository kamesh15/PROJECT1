package com.reimbursement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="EmployeeDetails")
public class EmployeeDetailsEntity {
	
	@Id
	@Column (name="Employee_id")
	private String employeeId;
	
	@NotNull
	@Column(name="Password",unique = true)
	private String password;
	
	@Column (name="First_Name")
	private String firstname;
	
	@Column (name="Last_Name")
	private String lastname;
	
	@Column (name="Designation")
	private String designation;
	
	@Column (name="Department")
	private String department;
	
	@Column (name="Phone_No")
	private String phoneno;
	
	@Column (name="Email_ID",unique =true)
	private String emailid;
	
	@Column (name="Type")
	private String type;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=ReimbursementDetailsEntity.class)
	List<ReimbursementDetailsEntity> reimbursementList;
	
	public List<ReimbursementDetailsEntity> getReimbursementList() {
		return reimbursementList;
	}
	public void setReimbursementList(List<ReimbursementDetailsEntity> reimbursementList) {
		this.reimbursementList = reimbursementList;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetailsEntity [employeeId=" + employeeId + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", designation=" + designation + ", department=" + department
				+ ", phoneno=" + phoneno + ", emailid=" + emailid + ", type=" + type + ", reimbursementList="
				+ reimbursementList + "]";
	}
	
	
	

	
}
