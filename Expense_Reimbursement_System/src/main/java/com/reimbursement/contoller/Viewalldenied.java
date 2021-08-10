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


public class Viewalldenied extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();
		
		List<EmployeeDetailsEntity> elist=ersservice.displayallempdetails();
		
		List<ReimbursementDetailsEntity> rlist=ersservice.viewalldenied();
		
		out.println("<table width=500 height=500 border=1>");
		out.println("<caption> Employee Details </caption>");
		
		for(EmployeeDetailsEntity e: elist)
		{
			out.println("<tr><td>"+"Employe ID: "+e.getEmployeeId()+"</td><td>"+"First Name: "+e.getFirstname()+"</td><td>"+"Last Name: "+e.getLastname()+"</td><td>"+"Department: "+e.getDepartment()+"</td><td>"+"Designation: "+e.getDesignation()+"</td><td>"+"Phone no: "+e.getPhoneno()+"</td><td>"+"Email ID: "+e.getEmailid()+"</tr></td>" );
		}
		out.println("</table>");
		
		out.println("<table width=500 height=500 border=1>");
		out.println("<caption> Denied Reimbursement Details </caption>");
		for(ReimbursementDetailsEntity r:rlist)
		{
			out.println("<tr><td>"+"Reimbursement_id: "+r.getReimbursementId()+"</td><td>"+"Employee_Id: "+r.getEmployeeId()+"</td><td>"+"Type of reimbursement: "+r.getReimbursementtype()+"</td><td>"+"Amount of reimbursement: Rs."+r.getAmount()+"</td><td>"+"Reimbursement Description: "+r.getDescription()+"</td><td>"+"Status: "+r.getStatus()+"</tr></td>");
		}
		
		out.println("</table>");
		
		out.println("<form action='ManagerHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
