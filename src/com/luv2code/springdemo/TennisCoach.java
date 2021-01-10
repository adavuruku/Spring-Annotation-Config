package com.luv2code.springdemo;

import org.springframework.stereotype.Component;


// IOC with Annotation
//@Component - this mark class as a bean
//and register this in spring container
// where the bean ID is tennisCoach
// also u can just use @Component and spring
// will use the class name (default ID) as the bean ID 
// by converting the first letter to lower case eg tennisCoach
//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
