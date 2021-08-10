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
			
		for(EmployeeDetailsEntity e:elist) {
			if(empid.equals(e.getEmployeeId()) && type.equalsIgnoreCase("Employee")) 
			{
				isPresent=true;
				break;
			}}
		
		if(isPresent)
		{
			rd=request.getRequestDispatcher("EmployeeHomePage.jsp");
			rd.forward(request, response);
			//out.println("appplication");
		}
		else if(type.equalsIgnoreCase("Manager"))
		{
			rd=request.getRequestDispatcher("ManagerHomePage.jsp");
			rd.forward(request, response);
			//out.println("manager");
		} 
		
		else
		{
			rd=request.getRequestDispatcher("EmployeeNotFound.jsp");
			rd.forward(request, response);
			//out.println("not yet");
		}
		
		/*for(EmployeeDetailsEntity e:elist)
		{for(employeedetailsEntity 
			if(empid.equals(e.getEmployeeId()) && type.equalsIgnoreCase("Employee")) 
			{
				out.println("appplication");
				//break;
			}
			
			else if(type.equalsIgnoreCase("manager"))
			{
				out.println("manager");
				//break;
			}
			
			else
			{
				out.println("not yet registed");
				//break;
			}
		}*/
			
		
		/*if(empid.equals(empid) && type.equalsIgnoreCase("Employee"))
			{out.println("can enter app page");}
		
		else if(type.equalsIgnoreCase("Manager"))
			{out.println("can enter manager page");}*/
		
		
		
		
		/*
		if(isPresent) 
		{
			rd=request.getRequestDispatcher("3Application.jsp");
			rd.forward(request, response);
		}
				
		else if(type.equalsIgnoreCase("Manager"))
		{
			rd=request.getRequestDispatcher("6ManagerPage.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			rd=request.getRequestDispatcher("EmployeeNotFound.jsp");
			rd.forward(request, response);
			
			 
				
			
		}*/
		}
		
	}


