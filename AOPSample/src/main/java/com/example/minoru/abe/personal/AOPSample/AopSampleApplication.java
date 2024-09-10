package com.example.minoru.abe.personal.AOPSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.minoru.abe.personal.AOPSample.service.TargetService;

@SpringBootApplication
public class AopSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args)
		.getBean(AopSampleApplication.class).exe();
	}
	
	@Autowired
	private TargetService service;
	
	private void exe() {
		service.sayHello("Minoru");
		System.out.println("***************");
		service.sayGoodbye("Hanako");
		
	}

}
