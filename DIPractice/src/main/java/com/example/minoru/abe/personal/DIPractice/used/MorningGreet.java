package com.example.minoru.abe.personal.DIPractice.used;

import org.springframework.stereotype.Component;

//@Component
public class MorningGreet implements Greet{
	@Override
	public String greet() {
		return "Good Morning!!";
	}

}
