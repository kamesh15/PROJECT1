package com.reimbursement.service;

import java.util.List;
import java.util.logging.Logger;

import com.reimbursement.dao.ReimbursementDAO;
import com.reimbursement.dao.ReimbursementDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;

public class ReimbursementServiceImpl implements ReimbursementService{
	
	static Logger logger=Logger.getLogger("ReimbursementServiceImpl.class");
	
	ReimbursementDAO employeedao=new ReimbursementDAOImpl();
	
	public void addemployeedetails(EmployeeDetails ed)
	{
		logger.info("Adding Employee details........\n");
		employeedao.addemployeedetails(ed);
	}
	
	public List<EmployeeDetailsEntity> loginvalidation()
	{
		logger.info("Login Validation........\n");
		return employeedao.loginvalidation();
	}
	
	public List<EmployeeDetailsEntity> registrationvalidation()
	{
		logger.info("Registration Validation........\n");
		return employeedao.registrationvalidation();
	}

	public void addemployeereimdetails(ReimbursementDetails rd)
	{
		logger.info("Adding Employee Reimbursement details........\n");
		employeedao.addemployeereimdetails(rd);
	}
	
	public List<EmployeeDetailsEntity> displayallempdetails()
	{
		logger.info("Display Employee details........\n");
		return employeedao.displayallempdetails();
	}
	
	public List<ReimbursementDetailsEntity> displayreimdetailsofemp(String empid)
	{
		logger.info("Display particular Employee reimbursement details........\n");
		return employeedao.displayreimdetailsofemp(empid);
	}
	
	public List<ReimbursementDetailsEntity> reimdetailsforemp(String empid)
	{
		logger.info("Display particular Employee all reimbursement details........\n");
		return employeedao.reimdetailsforemp(empid);
	}
	
	public List<EmployeeDetailsEntity> detailsofemp(String empid)
	{
		logger.info("Display particular Employee details........\n");
		return employeedao.detailsofemp(empid);
	}
	
	public List<ReimbursementDetailsEntity> viewallreimrequest()
	{
		logger.info("Display all Employee reimbursement details........\n");
		return employeedao.viewallreimrequest();
	}
	
	public List<ReimbursementDetailsEntity> viewallapproved()
	{
		logger.info("Display all approved reimbursement details........\n");
		return employeedao.viewallapproved();
	}
	
	public List<ReimbursementDetailsEntity> viewalldenied()
	{
		logger.info("Display all denied reimbursement details........\n");
		return employeedao.viewalldenied();
	}
	
	public List<ReimbursementDetailsEntity> viewallpending()
	{
		logger.info("Display pending reimbursement details........\n");
		return employeedao.viewallpending();
	}
	
	public void updateReimbursementRequest(Integer rid ,String type)
	{
		 logger.info("Update Employee reimbursement request status........\n");
		 employeedao.updateReimbursementRequest(rid, type);
	}
	
	public void updateprofile(EmployeeDetails ed)
	{
		logger.info("update Employee details........\n");
		employeedao.updateprofile(ed);
	}
}

