package reimbursement_project1_test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.junit.Test;

import com.reimbursement.dao.ReimbursementDAO;
import com.reimbursement.dao.ReimbursementDAOImpl;
import com.reimbursement.entity.EmployeeDetailsEntity;
import com.reimbursement.entity.ReimbursementDetailsEntity;
import com.reimbursement.util.HibernateUtil;

public class Reimbursement_Test {


	@Test
	public void testRegistrationvalidation() {

          List<EmployeeDetailsEntity> elist=new ArrayList<EmployeeDetailsEntity>();
         
          ReimbursementDAO employeedao=new ReimbursementDAOImpl();
          elist= employeedao.registrationvalidation();
          assertNotNull(elist);
	
	}
	
	
	@Test
	public void testAddemployeedetails() {
		boolean flag=false;
		  try {
			  Session session=HibernateUtil.getSessionFactory().openSession();
			
					flag=true;
		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			assertTrue(flag);
		}
	

	@Test
	public void testLoginvalidation() {

        List<EmployeeDetailsEntity> elist=new ArrayList<EmployeeDetailsEntity>();
       
        ReimbursementDAO employeedao=new ReimbursementDAOImpl();
        elist= employeedao.loginvalidation();
        assertNotNull(elist);
	
	}
	

	@Test
	public void testAddemployeereimdetails() {
		
		boolean flag=false;
		  try {
			  Session session=HibernateUtil.getSessionFactory().openSession();
			
					flag=true;
		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			assertTrue(flag);
		}
	

	@Test
	public void testDisplayallempdetails() {
		
		 List<EmployeeDetailsEntity> elist=new ArrayList<EmployeeDetailsEntity>();
	        ReimbursementDAO employeedao=new ReimbursementDAOImpl();
	        elist= employeedao.displayallempdetails();
	        assertNotNull(elist);
	}

	
	@Test
	public void testDisplayreimdetailsofemp() {
			
		 ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		 employeedao.displayreimdetailsofemp("2");
	}
	

	@Test
	public void testReimdetailsforemp() {
		
		 ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		 employeedao.displayreimdetailsofemp("1");
	}
	

	@Test
	public void testDetailsofemp() {
		
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		 employeedao.detailsofemp("2");
	}

	
	@Test
	public void testViewallreimrequest() {
		
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		elist= employeedao.viewallreimrequest();
		assertNotNull(elist);
		
	}
	

	@Test
	public void testViewallapproved() {
		
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		elist= employeedao.viewallapproved();
		assertNotNull(elist);

	}

	
	@Test
	public void testViewalldenied() {
		
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		elist= employeedao.viewalldenied();
		assertNotNull(elist);
	}

	
	@Test
	public void testViewallpending() {
		
		List<ReimbursementDetailsEntity> elist=new ArrayList<ReimbursementDetailsEntity>();
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		elist= employeedao.viewallpending();
		assertNotNull(elist);
	}

	
	@Test
	public void testUpdateReimbursementRequest() {
		
		ReimbursementDAO employeedao=new ReimbursementDAOImpl();
		 employeedao.updateReimbursementRequest(2,"Accepted");
	}

	
	@Test
	public void testUpdateprofile() {
		//fail("Not yet implemented");
	}

}
