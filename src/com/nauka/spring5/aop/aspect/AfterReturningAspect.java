package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {

	@Pointcut("execution(String com.nauka.spring5.aop.dao.ClientDAO.getClient(..))")
	public void getClientPointCut() {}
	
	@AfterReturning(pointcut = "getClientPointCut()", returning = "result")
	public void afterReturningClient(JoinPoint joinPoint, String result) {
		
		//wydruk wartosci zwracanej przez funkcje
		System.out.println(">>>>> @AfterReturning: " + result);
	}
}