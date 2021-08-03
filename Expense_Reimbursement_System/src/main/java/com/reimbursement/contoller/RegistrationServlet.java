package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.service.EmployeeRegistrationService;
import com.reimbursement.service.EmployeeRegistrationServiceImpl;




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
		String type=request.getParameter("type");
		
		EmployeeDetails employee=new EmployeeDetails();
		employee.setEmployeeId(id);
		employee.setPassword(pwd);
		employee.setFirstname(fname);
		employee.setLastname(lname);
		employee.setDepartment(dep);
		employee.setDesignation(des);
		employee.setEmailid(email);
		employee.setType(type);
		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImpl();
		ersservice.addemployeedetails(employee);	
		
		request.setAttribute("EmployeeDetail", ersservice);
		
		response.sendRedirect("http://localhost:8080/Expense_Reimbursement_System/successfull.jsp");
		
		
	}

}
