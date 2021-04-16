package com.sp.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.tech.service.EventService;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner {
	
	@Autowired
	private EventService eventService;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		eventService.saveEvent();
		
	}

}
