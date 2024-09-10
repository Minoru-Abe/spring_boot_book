package com.example.minoru.abe.personal.DIPractice.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet{
	@Override
	public String greet() {
		return "Good Evening!";
	}

}
