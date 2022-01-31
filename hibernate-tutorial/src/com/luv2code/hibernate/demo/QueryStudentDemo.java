package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create sessionFactory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session 
		Session session=factory.getCurrentSession();
		try {
			//start the transaction
			session.beginTransaction();
			
			//query Student
			List<Student> theStudent=session.createQuery("from Student").getResultList();
			for(Student temp:theStudent) {
				System.out.println(temp);
			}
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("done!");
		}
		finally {
			factory.close();
		}
	}

}
