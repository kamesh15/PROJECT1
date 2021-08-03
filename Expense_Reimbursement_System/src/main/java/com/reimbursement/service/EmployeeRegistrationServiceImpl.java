package com.reimbursement.service;

import com.reimbursement.dao.EmployeeRegistrationDAO;
import com.reimbursement.dao.EmployeeRegistrationDAOImpl;
import com.reimbursement.model.EmployeeDetails;

public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService{
	
	EmployeeRegistrationDAO employeedao=new EmployeeRegistrationDAOImpl();
	
	public void addemployeedetails(EmployeeDetails ed)
	{
		employeedao.addemployeedetails(ed);
	}

}
