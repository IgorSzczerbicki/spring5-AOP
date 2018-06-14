package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAspect {
	
	@Pointcut("execution(* com.nauka.spring5.aop.dao.ClientDAO.*(..))")
	public void afterThrowingNameExc() {}
	
	@AfterThrowing(pointcut = "afterThrowingNameExc()", throwing="exc")
	public void afterThrowingWrongName(JoinPoint joinPoint, Throwable exc) {
		
		System.out.println("^^^^^ exception thrown: " + exc);
	}
}