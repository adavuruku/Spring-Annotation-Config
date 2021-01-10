package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// Constructor Dependency Injection with Annotation

@Component
public class TennisCoachDIConstructor implements Coach {

	
	private FortuneService fortuneService;
	
	
//	@Value("${foo.email}")
//	private String email;
//	    
//	@Value("${foo.team}")
//	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	// @Autowired annotation indicate injection
	// spring will look for class that implement the FortuneService
	// and implement it here
	
	/*You can comment out the @Autowired annotation and the 
	 * program will still wor fine
	 * As of Spring Framework 4.3, an @Autowired annotation on 
	 * such a constructor is no longer necessary if the target
	 *  bean only defines one constructor to begin with. 
	 *  However, if several constructors are available, 
	 *  at least one must be annotated to teach the container 
	 *  which one to use.
	 */
	@Autowired
	public TennisCoachDIConstructor(@Qualifier("fortuneServiceImplement") FortuneService fortuneService) {
		System.out.println("Inside Constructor DI Annotation ");
		this.fortuneService = fortuneService;
	}
	
	
//	public String getEmail() {
//		return email;
//	}
//
//	public String getTeam() {
//		return team;
//	}
	
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
