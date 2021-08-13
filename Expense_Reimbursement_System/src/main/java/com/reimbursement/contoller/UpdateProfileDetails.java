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
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class UpdateProfileDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		String pwd=request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dep=request.getParameter("dep");
		String des=request.getParameter("des");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
			
		EmployeeDetails employee=new EmployeeDetails();
		employee.setEmployeeId(empid);
		employee.setPassword(pwd);
		employee.setFirstname(fname);
		employee.setLastname(lname);
		employee.setDepartment(dep);
		employee.setDesignation(des);
		employee.setEmailid(email);
		employee.setPhoneno(phoneno);
			
		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		
	//updating profile of employee....
		ersservice.updateprofile(employee);
		out.println("<h1>Your Profile got updated Successfully.......</h1>");
		
	
		List<EmployeeDetailsEntity> elist=ersservice.detailsofemp(empid);
		
	//display updated profile
		out.println("<table width=1300 height=100 border=1 style='background-color:#ffe8fc'>");
		out.println("<caption> Your Updated personal details </caption>");
		out.println("<tr><th>Employee Id</th><th>First Name</th><th>Last Name</th><th>Department</th><th>Designation</th><th>Phone no</th><th>Email Id</th><tr>");
		for(EmployeeDetailsEntity e:elist)
		{
			out.println("<tr><td>"+e.getEmployeeId()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getPhoneno()+"</td><td>"+e.getEmailid()+"</tr></td>" );
		}
		
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
