package com.reimbursement.service;

import java.util.List;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;

public interface ReimbursementService {
	
	void addemployeedetails(EmployeeDetails ed);

	public List<EmployeeDetailsEntity> registrationvalidation();
	
	public List<EmployeeDetailsEntity> loginvalidation();
	
	public void addemployeereimdetails(ReimbursementDetails rd);
	
	//public void displayreimdetails(empid,password);
	
	public List<EmployeeDetailsEntity> displayallempdetails();

	public List<ReimbursementDetailsEntity> displayreimdetailsofemp(String empid);
	
	public List<ReimbursementDetailsEntity> reimdetailsforemp(String empid);
	
	public List<EmployeeDetailsEntity> detailsofemp(String empid);
	
	public List<ReimbursementDetailsEntity> viewallreimrequest();
	
	public List<ReimbursementDetailsEntity> viewallapproved();
	
	public List<ReimbursementDetailsEntity> viewalldenied();
	
	public List<ReimbursementDetailsEntity> viewallpending();
	
	public void updateReimbursementRequest(Integer rid ,String type);
	
	public void updateprofile(EmployeeDetails ed);
}
