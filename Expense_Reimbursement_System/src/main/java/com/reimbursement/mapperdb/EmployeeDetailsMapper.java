package com.reimbursement.mapperdb;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;

public class EmployeeDetailsMapper {
	
	public static EmployeeDetailsEntity mapEmployee(EmployeeDetails ed)
	{
		EmployeeDetailsEntity entity=new EmployeeDetailsEntity();
		
		entity.setEmployeeId(ed.getEmployeeId());
		entity.setPassword(ed.getPassword());
		entity.setFirstname(ed.getFirstname());
		entity.setLastname(ed.getLastname());
		entity.setDesignation(ed.getDesignation());
		entity.setDepartment(ed.getDepartment());
		entity.setEmailid(ed.getEmailid());
		entity.setPhoneno(ed.getPhoneno());
		entity.setType(ed.getType());
		
		return entity;
		
	}

}
