package com.PayVang.Mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application {
	
	// PayVang.Mobile entry point
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
