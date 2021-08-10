package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.model.ReimbursementDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class Reimdetailsforemp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empid=request.getParameter("empid");
		ReimbursementDetails reimdetails=new ReimbursementDetails();
		
		reimdetails.setEmployeeId(empid);

		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		List<ReimbursementDetailsEntity> elist=ersservice.reimdetailsforemp(empid);
		
		out.println("<table width=1300 height=700 border=1>");
		out.println("<caption> Your all Reimbursement details </caption>");
		
		for(ReimbursementDetailsEntity e: elist)
		{
		    out.println("<tr><td>"+"Reimbursement_id: "+e.getReimbursementId()+"</td><td>"+"Employee_Id: "+e.getEmployeeId()+"</td><td>"+"Type of reimbursement: "+e.getReimbursementtype()+"</td><td>"+"Amount of reimbursement: Rs."+e.getAmount()+"</td><td>"+"Reimbursement Description: "+e.getDescription()+"</td><td>"+"Status: "+e.getStatus()+"</tr></td>");                                              
		}
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
