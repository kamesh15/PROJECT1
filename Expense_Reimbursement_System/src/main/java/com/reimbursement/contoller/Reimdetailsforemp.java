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
		
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		ReimbursementDetails reimdetails=new ReimbursementDetails();
		
		reimdetails.setEmployeeId(empid);

		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		List<ReimbursementDetailsEntity> elist=ersservice.reimdetailsforemp(empid);
		
	//Display Reimbursement for particular Employee....
		out.println("<table width=80% height=70% border=1 style='background-color:#f0f5ff'>");
		out.println("<caption> Your all Reimbursement details </caption>");
		out.println("<tr><th>Reimbursement Id</th><th>Employee Id</th><th>Type of reimbursement</th><th>Amount of reimbursement</th><th>Reimbursement Description</th><th>Status</th><tr>");
		for(ReimbursementDetailsEntity e: elist)
		{
			out.println("<tr><td>"+e.getReimbursementId()+"</td><td>"+e.getEmployeeId()+"</td><td>"+e.getReimbursementtype()+"</td><td>"+" Rs. "+e.getAmount()+"</td><td>"+e.getDescription()+"</td><td>"+e.getStatus()+"</tr></td>");                                              
		}
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
