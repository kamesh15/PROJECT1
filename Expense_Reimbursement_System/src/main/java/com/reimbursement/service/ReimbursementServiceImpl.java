package com.reimbursement.service;

import java.util.List;

import com.reimbursement.dao.ReimbursementDAO;
import com.reimbursement.dao.ReimbursementDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
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
	
	public List<EmployeeDetailsEntity> displayallempdetails()
	{
		return employeedao.displayallempdetails();
	}
	
	public List<ReimbursementDetailsEntity> displayreimdetailsofemp(String empid)
	{
		return employeedao.displayreimdetailsofemp(empid);
	}
	
	public List<ReimbursementDetailsEntity> reimdetailsforemp(String empid)
	{
		return employeedao.reimdetailsforemp(empid);
	}
	
	public List<EmployeeDetailsEntity> detailsofemp(String empid)
	{
		return employeedao.detailsofemp(empid);
	}
	
	public List<ReimbursementDetailsEntity> viewallreimrequest()
	{
		return employeedao.viewallreimrequest();
	}
	
	public List<ReimbursementDetailsEntity> viewallapproved()
	{
		return employeedao.viewallapproved();
	}
	
	public List<ReimbursementDetailsEntity> viewalldenied()
	{
		return employeedao.viewalldenied();
	}
	
	public List<ReimbursementDetailsEntity> viewallpending()
	{
		return employeedao.viewallpending();
	}
	
	public void updateReimbursementRequest(Integer rid ,String type)
	{
		 employeedao.updateReimbursementRequest(rid, type);
	}
}

