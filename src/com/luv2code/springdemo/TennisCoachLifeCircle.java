package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// learning scope

@Component
@Scope()
public class TennisCoachLifeCircle implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your Scope volley";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
	
	//from Java 9 and above both @PostConstruct and @PreDestroy cannot be import 
	//because javax.annotation-api-1.3.2 has been remove from eclipse classpath
	// so download from https://search.maven.org/remotecontent?filepath=javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar
	// and add to classpath and lib folder
	@PostConstruct
	public void initBean() {
		System.out.println("Bean Initialize");
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("Bean Destroyed");
	}

}
