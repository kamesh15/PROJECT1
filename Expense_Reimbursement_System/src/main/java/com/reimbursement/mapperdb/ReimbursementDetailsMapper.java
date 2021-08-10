package com.reimbursement.mapperdb;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;

public class ReimbursementDetailsMapper {
	
	public static ReimbursementDetailsEntity mapReimdetails(ReimbursementDetails rd)
	{
		ReimbursementDetailsEntity reimentity=new ReimbursementDetailsEntity();
		
		reimentity.setEmployeeId(rd.getEmployeeId());
		reimentity.setReimbursementId(rd.getReimbursementId());
		reimentity.setReimbursementtype(rd.getReimbursementtype());
		reimentity.setAmount(rd.getAmount());
		reimentity.setDescription(rd.getDescription());
		reimentity.setStatus(rd.getStatus());
		
		return reimentity;
	}

}
