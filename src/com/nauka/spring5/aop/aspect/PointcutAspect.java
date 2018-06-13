package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {

	//zdefiniowanie wyrazenia Pointcut
	@Pointcut("execution(* com.nauka.spring5.aop.dao.*.*(..))")
	public void forDaoPackage() {};
	
	//zastosowanie wczesniej zdefiniowanego wyrazenia
	@Before("forDaoPackage()")
	public void pointcutTest() {
		System.out.println("><><><>< Pointcut declaration test");
	}
}