package com.example.minoru.abe.personal.InjectionSample.example.impl;

import org.springframework.stereotype.Component;

import com.example.minoru.abe.personal.InjectionSample.example.Example;
import com.example.minoru.abe.personal.InjectionSample.service.SomeService;

@Component
public class ConstructorInjectionOmitExample implements Example{
	private final SomeService someService;
	
	public ConstructorInjectionOmitExample(SomeService someService) {
		this.someService = someService;
	}
	
	public void run() {
		someService.doService();
	}

}
