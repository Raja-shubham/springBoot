package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SpringConfig {
	
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for our swimCoach and inject dependencies
	@Bean
	public Coach SwimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
