package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//create sessionFactory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session 
		Session session=factory.getCurrentSession();
		try {
			
			int studentId=3;
			//start the transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieving student from studentId
			System.out.println("getting student"+" "+studentId);
			
			Student myStudent=session.get(Student.class,studentId);
			
			System.out.println("updating Student firstname");
			myStudent.setFirstName("Pela");
			
			//commit the transaction
			session.getTransaction().commit();
			
			//New Code
			//start the transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//updating all emailAddress
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
			System.out.println("done!");
		}
		finally {
			factory.close();
		}
	}

}
