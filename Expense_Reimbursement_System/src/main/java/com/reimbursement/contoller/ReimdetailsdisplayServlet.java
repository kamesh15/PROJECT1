package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;

public class ReimdetailsdisplayServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empid=request.getParameter("empid");
		String email=request.getParameter("email");
		String password=request.getParameter("psw");
		
		EmployeeDetails employee=new EmployeeDetails();
		
		employee.setEmployeeId(empid);
		employee.setEmailid(email);
		employee.setPassword(password);
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();
		
	   // ersservice.displayreimdetails(empid,password);
		
		
		
		
		
	}

}
