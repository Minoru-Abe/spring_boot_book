package com.example.minoru.abe.personal.AOPSample.service;

import org.springframework.stereotype.Service;

@Service
public class TargetService {
	
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public void sayGoodbye(String name) {
		System.out.println("Goodbye, " + name + "!");
	}

}
