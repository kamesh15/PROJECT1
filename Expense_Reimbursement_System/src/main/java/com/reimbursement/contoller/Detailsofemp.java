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


public class Detailsofemp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EmployeeDetails employee=new EmployeeDetails();
		String empid=request.getParameter("empid");
		employee.setEmployeeId(empid);
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		
		List<EmployeeDetailsEntity> elist=ersservice.detailsofemp(empid);
		
		out.println("<table width=1300 height=100 border=1>");
		out.println("<caption> Your personal details </caption>");
		
		for(EmployeeDetailsEntity e:elist)
		{
			out.println("<tr><td>"+"Employe ID: "+e.getEmployeeId()+"</td><td>"+"First Name: "+e.getFirstname()+"</td><td>"+"Last Name: "+e.getLastname()+"</td><td>"+"Department: "+e.getDepartment()+"</td><td>"+"Designation: "+e.getDesignation()+"</td><td>"+"Phone no: "+e.getPhoneno()+"</td><td>"+"Email ID: "+e.getEmailid()+"</tr></td>" );
		}
		
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
		
	}

}
