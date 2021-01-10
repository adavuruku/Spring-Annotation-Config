package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
/*
 * You can have several implementation of 
 * the service eg we have AnotherFortuneServiceImplement and FortuneServiceImplement
 * In injecting such services using @Autowired you need to 
 * specify the implemented bean using @Qualifier annotation
 * else spring will not be able to choose the ryt service
 * and throw error "expected single matching bean but found 2: anotherFortuneServiceImplement,fortuneServiceImplement"
 * */
@Component
public class AnotherFortuneServiceImplement implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
