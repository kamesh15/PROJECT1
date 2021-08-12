package com.reimbursement.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reimbursement.dao.ReimbursementDAO;
import com.reimbursement.dao.ReimbursementDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.service.ReimbursementService;
import com.reimbursement.service.ReimbursementServiceImpl;

public class UpdateApproveDeny extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String rid=request.getParameter("rid");
		String type=request.getParameter("type");
		
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();	
		Integer id=Integer.parseInt(rid);
		employeedao.updateReimbursementRequest(id, type);
		
		out.println("<table>");
		
		out.println("<tr><td>"+"Reimbursement Id: "+rid+"</td><td>"+"Status: "+type+"</tr></td>");
		out.println("\n You have validated the employee Reimbursement Request , Please go back to home");
		out.println("<form action='ManagerHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
		
}
}
