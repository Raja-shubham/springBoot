package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		//create sessionFactory
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session 
		Session session=factory.getCurrentSession();
		try {
			
			//create 3 student objects
			System.out.println("creating object");
			Student temp1=new Student("Paul","wall","paul@luv2code.com");
			Student temp2=new Student("raj","ss","raj@luv2code.com");
			Student temp3=new Student("vv","kk","vv@luv2code.com");
			
			//start the transaction
			session.beginTransaction();
			
			//save 3 student objects
			session.save(temp1);
			session.save(temp2);
			session.save(temp3);
			System.out.println("saving  3 student objects");
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("done!");
		}
		finally {
			factory.close();
		}
	}

}
