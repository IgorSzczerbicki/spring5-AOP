package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {

	@After("execution(* com.nauka.spring5.aop.dao.ClientDAO.*(..))")
	public void alwaysRuns(JoinPoint joinPoint) {
		System.out.println("**** @After ****");
	}
}