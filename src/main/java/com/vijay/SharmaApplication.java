package com.vijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SharmaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SharmaApplication.class, args);
		
		 ConfigurableApplicationContext context = SpringApplication.run(SharmaApplication.class, args);
	        System.out.println("✅ Active Profile(s): " + String.join(", ", context.getEnvironment().getActiveProfiles()));
	}

}
