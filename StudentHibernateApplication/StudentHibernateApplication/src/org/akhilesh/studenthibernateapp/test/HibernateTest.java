package org.akhilesh.studenthibernateapp.test;

import java.util.Date;

import org.akhilesh.studenthibernateapp.dto.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	
	public static void main(String args[]) {
		
		Department sampleDept = new Department();
		sampleDept.setDeptName("physics");
		sampleDept.setDeptNumber("01");
		sampleDept.setMgrSSN(100000000);
		sampleDept.setMgrStartDate(new Date());
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(sampleDept);
		session.getTransaction().commit();
		
		// Get the Session object
		
		Department sampleDept2 = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		Department DeptName = (Department)session.get(Department.class,1);
		System.out.println("User name reterived is"+sampleDept2.getDeptName());
		
		
		
	}
	
		
	

}
