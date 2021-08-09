package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;

public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dep=request.getParameter("dep");
		String des=request.getParameter("des");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String type=request.getParameter("type");
		
		EmployeeDetails employee=new EmployeeDetails();
		employee.setEmployeeId(id);
		employee.setPassword(pwd);
		employee.setFirstname(fname);
		employee.setLastname(lname);
		employee.setDepartment(dep);
		employee.setDesignation(des);
		employee.setEmailid(email);
		employee.setPhoneno(phoneno);
		employee.setType(type);
		
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		
		List<EmployeeDetailsEntity> elist=ersservice.registrationvalidation();
		boolean isPresent=false;
		RequestDispatcher rd=null;
			
		for(EmployeeDetailsEntity e:elist) {	
			if(id.equals(e.getEmployeeId()) || email.equals(e.getEmailid())) 
			{
				isPresent=true;
				break;
			}
		}
	
		if(isPresent) 
		{
			rd=request.getRequestDispatcher("AlreadyRegistered.jsp");
			rd.forward(request, response);
		}
		else 
		{
			ersservice.addemployeedetails(employee);
			rd=request.getRequestDispatcher("2Login.jsp");
			rd.forward(request, response);
		}
		
	}

}
