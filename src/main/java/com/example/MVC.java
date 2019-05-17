package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // tell spring that this is spring application 
public class MVC {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MVC.class, args);
	}

}
