package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachDIMethod implements Coach {
	private FortuneService fortuneService;
	
	public TennisCoachDIMethod() {
		System.out.println("Inside Default Method Constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void doSomeCrazyStuff(@Qualifier("fortuneServiceImplement") FortuneService fortuneService) {
		System.out.println("Doing Some Crazy Stuff");
		this.fortuneService = fortuneService;
	}

}
