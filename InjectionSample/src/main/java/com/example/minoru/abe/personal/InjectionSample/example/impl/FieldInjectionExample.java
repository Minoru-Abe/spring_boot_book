package com.example.minoru.abe.personal.InjectionSample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.minoru.abe.personal.InjectionSample.example.Example;
import com.example.minoru.abe.personal.InjectionSample.service.SomeService;

//@Component
public class FieldInjectionExample implements Example{
	
	@Autowired
	private SomeService someService;
	
	@Override
	public void run() {
		someService.doService();
	}
	

}
