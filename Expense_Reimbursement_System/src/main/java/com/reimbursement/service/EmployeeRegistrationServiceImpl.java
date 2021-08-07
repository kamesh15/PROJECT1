package com.reimbursement.service;

import java.util.List;

import com.reimbursement.dao.EmployeeRegistrationDAO;
import com.reimbursement.dao.EmployeeRegistrationDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService{
	
	EmployeeRegistrationDAO employeedao=new EmployeeRegistrationDAOImpl();
	
	public void addemployeedetails(EmployeeDetails ed)
	{
		employeedao.addemployeedetails(ed);
	}
	
	public List<EmployeeDetailsEntity> loginvalidation()
	{
		return employeedao.loginvalidation();
	}

}
