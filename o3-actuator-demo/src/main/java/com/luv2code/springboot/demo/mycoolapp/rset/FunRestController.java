package com.luv2code.springboot.demo.mycoolapp.rset;
import org.springframework.*;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
	
	//expose "/" return hello world
	@GetMapping("/")
	public String satHello() {
		
		return "hello world time on server is"+LocalDateTime.now();
	}
	//expose a new endpoint for workout 
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "run a hard 5k";
	}
	//expose new end point for fortune 
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "today is your lucky day";
	}

}



