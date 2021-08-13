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
//----------------------------------------------------------------------------------------------------------------
	//Inserting employee details..........
	
	public void addemployeedetails(EmployeeDetails ed) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			session.save(EmployeeDetailsMapper.mapEmployee(ed));
			System.out.println("employee details inserted...");
			session.getTransaction().commit();
			//session.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }
	
//----------------------------------------------------------------------------------------------------------------	
	//Getting employee details registration validation.........
	
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
	
//------------------------------------------------------------------------------------------------------------------
	//Getting employee details login validation.........
	
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
	
//------------------------------------------------------------------------------------------------------------------
	//Inserting Reimbursement request details..........
	
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
	
//-------------------------------------------------------------------------------------------------------------------
	//Display all employee details..................
	
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

//-------------------------------------------------------------------------------------------------------------
	//Displaying reimbursement details for a particular employee........
	
	public List<ReimbursementDetailsEntity> displayreimdetailsofemp(String empid)
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' ";
			
			Query q1=session.createQuery(q); 
		    
			
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
		
	}
	
//-------------------------------------------------------------------------------------------------------------
	//Display all reimbursement details to particular employee
	
	public List<ReimbursementDetailsEntity> reimdetailsforemp(String empid)
	{
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			String q="From ReimbursementDetailsEntity f where f.employeeId=\'"+empid+"\' ";
			
			Query q1=session.createQuery(q); 
		    
			
			elist=q1.list();	
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
		return elist;
	
	}
	
//---------------------------------------------------------------------------------------------------------------
	//Display employee personal details......................
	
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
	
//--------------------------------------------------------------------------------------------------------------------
	//display all reimbursement details to manager.....................
	
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
	
//---------------------------------------------------------------------------------------------------------------------
	//display all approved requests..........................
	
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
	
//------------------------------------------------------------------------------------------------------------
	//display all denied requests..........
	
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
	
	
//-----------------------------------------------------------------------------------------------------------------
	//display all pending details...........
	
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
	

//------------------------------------------------------------------------------------------------------------------
	// Update reimbursement request status.......
	
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
	
	
//-----------------------------------------------------------------------------------------------------------------
	//update personal informations.....
	
	public void updateprofile(EmployeeDetails ed)
	{
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction(); 
			EmployeeDetailsEntity ede = EmployeeDetailsMapper.mapEmployee(ed);
			EmployeeDetailsEntity ede1 = session.load(EmployeeDetailsEntity.class,ede.getEmployeeId());
			ede1.setPassword(ede.getPassword());
			ede1.setFirstname(ede.getFirstname());
			ede1.setLastname(ede.getLastname());
			ede1.setDepartment(ede.getDepartment());
			ede1.setDesignation(ede.getDesignation());
			ede1.setPhoneno(ede.getPhoneno());
			ede1.setEmailid(ede.getEmailid());
			
			session.saveOrUpdate(ede1);
			System.out.println("Profile updated.....");
			
			session.getTransaction().commit();
			//session.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	}
	
}
	
	
	



