package com.example.minoru.abe.personal.DIPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.minoru.abe.personal.DIPractice.used.Greet;

@SpringBootApplication
public class DiPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiPracticeApplication.class, args)
		.getBean(DiPracticeApplication.class).execute();
	}
	
	@Autowired
	private Greet g;
	
	private void execute() {
		String result = g.greet();
		System.out.println(result);
	}

}
