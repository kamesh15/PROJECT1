package com.reimbursement.dao;

import java.util.List;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;

public interface EmployeeRegistrationDAO {
	
	void addemployeedetails(EmployeeDetails ed);
	
	public List<EmployeeDetailsEntity> loginvalidation();

}
