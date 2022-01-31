package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		//create sessionFactory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session 
		Session session=factory.getCurrentSession();
		try {
			
			int studentId=4;
			//start the transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieving student from studentId
			System.out.println("getting student"+" "+studentId);
			
			Student myStudent=session.get(Student.class,studentId);
			
			//deleting student with studentId
		/*	System.out.println("deleting ...");
			session.delete(myStudent);*/
			
			//deleting studentId =5
			System.out.println("deleting studentI=5");
			session.createQuery("delete from Student where id=5").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("done!");
		}
		finally {
			factory.close();
		}
	}

}
