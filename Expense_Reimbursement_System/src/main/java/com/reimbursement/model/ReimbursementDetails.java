package com.reimbursement.model;

import org.hibernate.type.BlobType;

import javassist.bytecode.ByteArray;

public class ReimbursementDetails {

	private Integer reimbursementId;
	private String employeeId;
	private String reimbursementtype;
	private Double amount;
	private String description;
	private String status;
	private ByteArray invoice;
	//file upload
	
	public Integer getReimbursementId() {
		return reimbursementId;
	}
	public void setReimbursementId(Integer reimbursementId) {
		this.reimbursementId = reimbursementId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getReimbursementtype() {
		return reimbursementtype;
	}
	public void setReimbursementtype(String reimbursementtype) {
		this.reimbursementtype = reimbursementtype;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReimbursementDetails [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId
				+ ", reimbursementtype=" + reimbursementtype + ", amount=" + amount + ", description=" + description
				+ ", status=" + status + "]";
	}
	
	
	
	
}
