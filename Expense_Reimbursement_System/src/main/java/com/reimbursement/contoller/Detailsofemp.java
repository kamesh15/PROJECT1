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
		
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		employee.setEmployeeId(empid);
		
		ReimbursementService ersservice=new ReimbursementServiceImpl();	
		
		List<EmployeeDetailsEntity> elist=ersservice.detailsofemp(empid);
		
	//Employee Details for Particular Employee.....
		out.println("<table width=1300 height=100 border=1 style='background-color:#ffd6eb'>");
		out.println("<caption> Your personal details </caption>");
		out.println("<tr><th>Employee Id</th><th>First Name</th><th>Last Name</th><th>Department</th><th>Designation</th><th>Phone no</th><th>Email Id</th><tr>");
		for(EmployeeDetailsEntity e:elist)
		{
			out.println("<tr><td>"+e.getEmployeeId()+"</td><td>"+e.getFirstname()+"</td><td>"+e.getLastname()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getPhoneno()+"</td><td>"+e.getEmailid()+"</tr></td>" );
		}
		
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
		
	}

}
