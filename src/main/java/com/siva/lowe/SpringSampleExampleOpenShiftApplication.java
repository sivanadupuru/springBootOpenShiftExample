package com.siva.lowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSampleExampleOpenShiftApplication {
	@GetMapping("/sayWelcome")
	public String welcome()
	{
		return "welcome to Spring boot application deploy to open shift PF";
		
	}
	
	@GetMapping("/{input}")
	public String sayCongrats(@PathVariable String input)
	{
		return "Hii"+input+"your application deployed Successfully";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleExampleOpenShiftApplication.class, args);
	}
}
