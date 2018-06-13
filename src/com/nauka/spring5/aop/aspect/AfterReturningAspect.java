package com.nauka.spring5.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {

	@Pointcut("execution(* com.nauka.spring5.aop.dao.ClientDAO.getClient(..))")
	public void getClientPointCut() {}
	
	@AfterReturning(pointcut = "getClientPointCut()", returning = "result")
	public void afterReturningClient(JoinPoint joinPoint, List<String> result) {
		
		//wydruk wartosci zwracanej przez funkcje
		System.out.println(">>>>> @AfterReturning: " + result);
		
		result.set(0, "Modified: " + result.get(0));
		System.out.println(">>>>> @AfterReturning: modfied: " + result);
	}
}