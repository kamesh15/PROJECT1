package com.reimbursement.service;

import java.util.List;

import com.reimbursement.dao.ReimbursementDAO;
import com.reimbursement.dao.ReimbursementDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;

public class ReimbursementServiceImpl implements ReimbursementService{
	
	ReimbursementDAO employeedao=new ReimbursementDAOImpl();
	
	public void addemployeedetails(EmployeeDetails ed)
	{
		employeedao.addemployeedetails(ed);
	}
	
	public List<EmployeeDetailsEntity> loginvalidation()
	{
		return employeedao.loginvalidation();
	}
	
	public List<EmployeeDetailsEntity> registrationvalidation()
	{
		return employeedao.registrationvalidation();
	}

	public void addemployeereimdetails(ReimbursementDetails rd)
	{
		employeedao.addemployeereimdetails(rd);
	}
	
}
