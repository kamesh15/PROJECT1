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
import com.reimbursement.exception.EmployeeNotFoundException;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class LoginServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empid=request.getParameter("empid");
		String emppwd=request.getParameter("psw");
	    String type=request.getParameter("type");
		
	    EmployeeDetails employee=new EmployeeDetails();
	    
		employee.setEmployeeId(empid);
		employee.setPassword(emppwd);
		employee.setType(type);	
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();
		
		List<EmployeeDetailsEntity> elist=ersservice.loginvalidation();
		
		boolean isPresent=false;
		RequestDispatcher rd=null;
	
	//Login Validation
		for(EmployeeDetailsEntity e:elist) {
			if(empid.equals(e.getEmployeeId()) && type.equalsIgnoreCase("Employee") && emppwd.equals(e.getPassword())) 
			{
				isPresent=true;
				break;
			}}
		
		if(isPresent)
		{
			request.getSession().setAttribute("empid", empid);
			rd=request.getRequestDispatcher("EmployeeHomePage.jsp");
			rd.forward(request, response);
			
		}
		else if(type.equalsIgnoreCase("Manager"))
		{
			rd=request.getRequestDispatcher("ManagerHomePage.jsp");
			rd.forward(request, response);
			
		} 
		
		else
		{
			rd=request.getRequestDispatcher("EmployeeNotFound.jsp");
			rd.forward(request, response);
			
		}
		
		
		}
		
	}


