package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// get the bean from spring container
		Coach theCoach=context.getBean("SwimCoach",Coach.class);
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the container
		context.close();
	}
	
}
