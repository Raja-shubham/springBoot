package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//create sessionFactory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session 
		Session session=factory.getCurrentSession();
		try {
			
			//create the student object
			System.out.println("creating object");
			Student temp=new Student("Paul","wall","paul@luv2code.com");
			//start the transaction
			session.beginTransaction();
			//save the student object
			session.save(temp);
			System.out.println("saving student object");
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("done!");
		}
		finally {
			factory.close();
		}
	}

}
