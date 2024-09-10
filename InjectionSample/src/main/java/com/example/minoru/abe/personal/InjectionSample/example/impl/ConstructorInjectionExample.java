package com.example.minoru.abe.personal.InjectionSample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.minoru.abe.personal.InjectionSample.example.Example;
import com.example.minoru.abe.personal.InjectionSample.service.SomeService;

//@Component
public class ConstructorInjectionExample implements Example{
	private final SomeService someService;
	
	@Autowired
	public ConstructorInjectionExample(SomeService someService) {
		this.someService = someService;
	}
	
	public void run() {
		someService.doService();
	}

}
