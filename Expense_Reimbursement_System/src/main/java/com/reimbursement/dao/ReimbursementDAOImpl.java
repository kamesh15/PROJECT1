package com.reimbursement.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.query.Query;

import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.mapperdb.EmployeeDetailsMapper;
import com.reimbursement.mapperdb.ReimbursementDetailsMapper;
import com.reimbursement.model.EmployeeDetails;
import com.reimbursement.model.ReimbursementDetails;
import com.reimbursement.util.HibernateUtil;

public class ReimbursementDAOImpl implements ReimbursementDAO{
	
	public void addemployeedetails(EmployeeDetails ed) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			session.save(EmployeeDetailsMapper.mapEmployee(ed));
			System.out.println("employee details inserted...");
			session.getTransaction().commit();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }
	
	
	
	public List<EmployeeDetailsEntity> registrationvalidation(){
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
	
	
	
	public void addemployeereimdetails(ReimbursementDetails rd) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			session.save(ReimbursementDetailsMapper.mapReimdetails(rd));
			System.out.println("Reimbursement details inserted...");
			session.getTransaction().commit();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
	}
	
	public List<EmployeeDetailsEntity> displayallempdetails()
	{
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
	
	
	public List<ReimbursementDetailsEntity> displayreimdetailsofemp(String empid)
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' ";
			//String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' and f.status='null'";
			Query q1=session.createQuery(q); 
		    
			
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
		
	}
	
	public List<ReimbursementDetailsEntity> reimdetailsforemp(String empid)
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' ";
			//String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' and f.status='null'";
			Query q1=session.createQuery(q); 
		    
			
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	
	}
	
	
	public List<EmployeeDetailsEntity> detailsofemp(String empid)
	{
		List<EmployeeDetailsEntity> elist=new ArrayList<EmployeeDetailsEntity>();
		
		try {
					
					Session session=HibernateUtil.getSessionFactory().openSession();
					String q="From EmployeeDetailsEntity f where f.employeeId=\'"+empid+"\' ";
					Query q1=session.createQuery(q); 
				    
					
					elist=q1.list();	
					
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				 
				return elist;
	}
	
	public List<ReimbursementDetailsEntity> viewallreimrequest()
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query q=session.createQuery("from ReimbursementDetailsEntity e"); 
			elist=q.list();	
			
		} catch (Exception e1) {
			
		  e1.printStackTrace();
		}
		 
		return elist;
	}
	
	
	public List<ReimbursementDetailsEntity> viewallapproved()
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
		
			String q="From ReimbursementDetailsEntity f where f.status='Accepted'";
			Query q1=session.createQuery(q); 
		   
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;

	}
	
	
	public List<ReimbursementDetailsEntity> viewalldenied()
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
		
			String q="From ReimbursementDetailsEntity f where f.status='Rejected'";
			Query q1=session.createQuery(q); 
		   
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	}
	
	public List<ReimbursementDetailsEntity> viewallpending()
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
		
			String q="From ReimbursementDetailsEntity f where f.status=null";
			Query q1=session.createQuery(q); 
		   
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	}
	
	public void updateReimbursementRequest(Integer reimbursementId ,String status)
	{
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			
		
			ReimbursementDetailsEntity rde=session.load(ReimbursementDetailsEntity.class, reimbursementId);
			
			rde.setStatus(status);
			session.merge(rde);  
		
			System.out.println("status Updated....");
			session.getTransaction().commit();
			session.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}
}
	
	
	



