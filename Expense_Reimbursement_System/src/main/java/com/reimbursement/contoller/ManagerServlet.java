package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class ManagerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();
		
		PrintWriter out=response.getWriter();
		List<EmployeeDetailsEntity> elist=ersservice.displayallempdetails();
		
		for(EmployeeDetailsEntity e:elist)
		{
			//out.println(e.getEmployeeId() + e.getEmailid() + e.getReimbursementList());
		}
		
	}

}
