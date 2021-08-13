package com.reimbursement.contoller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.model.ReimbursementDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;

@MultipartConfig( maxFileSize=1024*1024*5)
public class ApplicationServlet extends HttpServlet {
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				
				String empid=String.valueOf(request.getSession().getAttribute("empid"));
				String reimtype=request.getParameter("type");
				String reimamount=request.getParameter("amount");
				String desc=request.getParameter("subject");
				InputStream inputStream = null;
			//Part invoicedocs = request.getPart("doc");
				
				ReimbursementDetails reimdetails=new ReimbursementDetails();
				
				reimdetails.setEmployeeId(empid);
				reimdetails.setReimbursementtype(reimtype);
				reimdetails.setAmount( Double.parseDouble(reimamount));
				reimdetails.setDescription(desc);
					
				ReimbursementService ersservice=new ReimbursementServiceImpl();	
				ersservice.addemployeereimdetails(reimdetails);
				
			// Display Reimbursement Details for Employee.......
				List<ReimbursementDetailsEntity> elist=ersservice.displayreimdetailsofemp(empid);
				
				out.println("<table width=80% height=50% border=1 style='background-color:#fffade'>");
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

