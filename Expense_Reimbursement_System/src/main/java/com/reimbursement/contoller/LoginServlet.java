package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.service.EmployeeRegistrationService;
import com.reimbursement.service.EmployeeRegistrationServiceImpl;


public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empid=request.getParameter("empid");
		String emppwd=request.getParameter("emppwd");
		String type=request.getParameter("type");
		//out.println(type);
		EmployeeDetails employee=new EmployeeDetails();
		employee.setEmployeeId(empid);
		employee.setPassword(emppwd);
		employee.setType(type);
		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImpl();
		List<EmployeeDetailsEntity> elist=ersservice.loginvalidation();
		
		for(EmployeeDetailsEntity e:elist) {
		if(empid.equals(e.getEmployeeId()))
		{
			if(type.equals(e.getType()))
			//out.println("Loged in as employee");
			response.sendRedirect("http://localhost:8080/Expense_Reimbursement_System/Application.html");
		}
		else if(type.equals("Manager"))
		{
			response.sendRedirect("http://localhost:8080/Expense_Reimbursement_System/ManagerPage.html");
		}
		else
		{
			throws new EmployeeNotFoundException("<h>")
		}
		}
		
	}

}
