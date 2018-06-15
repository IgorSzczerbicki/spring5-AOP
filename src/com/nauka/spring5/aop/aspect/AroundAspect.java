package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {
	
	@Around("execution(String com.nauka.spring5.aop.dao.CardDAO.getCard(..))")
	public Object getCardExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		
		long begin = System.currentTimeMillis();
		
		//wykonanie metody
		Object result = proceedingJoinPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		long dur = end - begin;
		System.out.println("$$$$$ @Around duration: " + dur);
		
		return result;
	}
}