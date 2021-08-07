package com.reimbursement.service;

import java.util.List;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;

public interface EmployeeRegistrationService {
	
	void addemployeedetails(EmployeeDetails ed);
	
	public List<EmployeeDetailsEntity> loginvalidation();

}
