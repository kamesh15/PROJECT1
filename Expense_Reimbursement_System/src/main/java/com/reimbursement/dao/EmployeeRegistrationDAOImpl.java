package com.reimbursement.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.query.Query;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.mapperdb.EmployeeDetailsMapper;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.util.HibernateUtil;

public class EmployeeRegistrationDAOImpl implements EmployeeRegistrationDAO{
	
	public void addemployeedetails(EmployeeDetails ed) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			session.save(EmployeeDetailsMapper.mapEmployee(ed));
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }
	
	public List<EmployeeDetailsEntity> loginvalidation(){
		List<EmployeeDetailsEntity> elist=new ArrayList<EmployeeDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query q=session.createQuery("from EmployeeDetailsEntity e"); 
			elist=q.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	}
}


