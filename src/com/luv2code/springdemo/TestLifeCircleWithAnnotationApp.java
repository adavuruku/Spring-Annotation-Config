package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCircleWithAnnotationApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoachLifeCircle", Coach.class);
		
		
		Coach theCoachTwo = context.getBean("tennisCoachLifeCircle", Coach.class);
		
		//true = Sessionscope - session run both initialise and destroy of life circle
		//false = prototype - prototype only run initialise no destroy
		System.out.println(theCoach == theCoachTwo);
		
		System.out.println("Memory Location theCoach = " + theCoach);
		
		System.out.println("Memory Location theCoach = " + theCoachTwo);
				
		// close the context
		context.close();
		
	}

}


