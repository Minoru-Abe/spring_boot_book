package com.example.minoru.abe.personal.AOPSample.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	// @Before("execution(* com.example.minoru.abe.personal.AOPSample.service.TargetService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		LocalDateTime startTime = LocalDateTime.now();
		String formattedTime = startTime
				.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("------------Before------------");
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Method started: " + formattedTime);
		
	}

	//@After("execution(* com.example.minoru.abe.personal.AOPSample.service.TargetService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		LocalDateTime startTime = LocalDateTime.now();
		String formattedTime = startTime
				.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("------------After------------");
		System.out.println("After method:" + joinPoint.getSignature());
		System.out.println("Method Finished: " + formattedTime);
		
	}
	
	@Around("execution(* com.example.minoru.abe.personal.AOPSample.service.TargetService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime = System.currentTimeMillis();
		System.out.println("===========Around(Before)===========");
		System.out.println("Target");
		System.out.println("Class  :" + joinPoint.getSignature()
				.getDeclaringTypeName());
		System.out.println("Method  :" + joinPoint.getSignature().getName());
		
		Object result = joinPoint.proceed();
		
		System.out.println("===========Around(After)===========");
		long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Method execution time: " + elapsedTime + "milliseconds.");
		return result;
		

		
		
	}
	

	
}
