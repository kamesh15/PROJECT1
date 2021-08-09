package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.model.ReimbursementDetails;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;


public class ApplicationServlet extends HttpServlet {
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				
				
				String reimtype=request.getParameter("type");
				String reimamount=request.getParameter("amount");
				String desc=request.getParameter("subject");
				
				ReimbursementDetails reimdetails=new ReimbursementDetails();
				reimdetails.setReimbursementtype(reimtype);
				reimdetails.setAmount( Double.parseDouble(reimamount));
				reimdetails.setDescription(desc);
				//reimdetails.set
				
				ReimbursementService ersservice=new ReimbursementServiceImpl();	
				ersservice.addemployeereimdetails(reimdetails);
				
				RequestDispatcher rd=request.getRequestDispatcher("4appliedappform.jsp");
				rd.forward(request, response);
			}

		
	}

