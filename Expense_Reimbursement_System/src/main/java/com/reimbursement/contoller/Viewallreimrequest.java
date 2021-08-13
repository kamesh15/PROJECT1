package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class Viewallreimrequest extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();
		
		List<EmployeeDetailsEntity> elist = ersservice.displayallempdetails();
		List<ReimbursementDetailsEntity> rlist = ersservice.viewallreimrequest();
		
	//Display employee details........
		out.println("<table width=1300 height=500 border=1 style='background-color:#ededff'>");
		out.println("<caption> Employee Details and Employee Reimbursement Details </caption>");
		out.println("<tr><th>Employee Id</th><th>First Name</th><th>Last Name</th><th>Department</th><th>Designation</th><th>Phone no</th><th>Email Id</th><tr>");
		for(EmployeeDetailsEntity e: elist)
		{
			out.println("<tr><td>"+e.getEmployeeId()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getPhoneno()+"</td><td>"+e.getEmailid()+"</tr></td>" );
		}
		out.println("</table>");
		
	//Display all reimbursement requests ........
		out.println("<table width=1300 height=700 border=1 style='background-color:#fff3ed'>");
		out.println("<tr><th>Reimbursement Id</th><th>Employee Id</th><th>Type of reimbursement</th><th>Amount of reimbursement</th><th>Reimbursement Description</th><th>Status</th><tr>");
		for(ReimbursementDetailsEntity r:rlist)
		{
			out.println("<tr><td>"+r.getReimbursementId()+"</td><td>"+r.getEmployeeId()+"</td><td>"+r.getReimbursementtype()+"</td><td>"+" Rs. "+r.getAmount()+"</td><td>"+r.getDescription()+"</td><td>"+r.getStatus()+"</tr></td>");
		}
		
		out.println("</table>");
		
		out.println("<form action='ManagerHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
					
		}
		
	}


