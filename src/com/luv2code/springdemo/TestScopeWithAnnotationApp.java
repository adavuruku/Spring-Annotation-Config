package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopeWithAnnotationApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoachScope", Coach.class);
		
		
		Coach theCoachTwo = context.getBean("tennisCoachScope", Coach.class);
		
		//true = Sessionscope
		//false = prototype
		System.out.println(theCoach == theCoachTwo);
		
		System.out.println("Memory Location theCoach = " + theCoach);
		
		System.out.println("Memory Location theCoach = " + theCoachTwo);
				
		// close the context
		context.close();
		
	}

}


