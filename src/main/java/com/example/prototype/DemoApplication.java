package com.example.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // tell spring that this is spring application 
public class DemoApplication {

	public static void main(String[] args) {
		// tell spring boot that this is a starting point to start my application
		//and start to create servlet container, and put this application into that container
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		//context = container, in this container is responsible for creating all of  our object or bean, cool
		
		System.out.println(context.containsBean("hello"));// check Bean
		System.out.println( "Start up date: " +context.getStartupDate());
		System.out.println("is Active: " + context.isActive());
		System.out.println("Application Name: " + context.getApplicationName());
		System.out.println("Display name: " + context.getDisplayName());
		
		Alien alien = (Alien) context.getBean(Alien.class);
		
		System.out.println("Bean Alien" + alien);
		
        Alien alien2 = (Alien) context.getBean(Alien.class);
		
		System.out.println("Bean Alien" + alien2);
	}

}