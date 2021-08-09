package com.reimbursement.dao;

import java.util.List;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;

public interface ReimbursementDAO {
	
	void addemployeedetails(EmployeeDetails ed);

	public List<EmployeeDetailsEntity> registrationvalidation();
	
	public List<EmployeeDetailsEntity> loginvalidation();

	public void addemployeereimdetails(ReimbursementDetails rd);
}
