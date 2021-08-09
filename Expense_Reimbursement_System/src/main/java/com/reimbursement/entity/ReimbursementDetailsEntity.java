package com.reimbursement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ReimbursementDetails")
public class ReimbursementDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="Reimbursement_Id")
	private Integer reimbursementId;
	
	@Column(name="Reimbursement_Type")
	private String reimbursementtype;
	
	@Column(name="Reimbursement_Amount")
	private Double amount;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Reimbursement_Status")
	private String status;

	public Integer getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(Integer reimbursementId) {
		this.reimbursementId = reimbursementId;
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

}
