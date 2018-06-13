package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JoinPointAspect {

	@Pointcut("execution(* com.nauka.spring5.aop.dao.CompanyDAO.*(String))")
	public void stringArg() {}
	
	@Before("stringArg()")
	public void displaySigAndArgs(JoinPoint joinPoint) {
		
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Object[] args = joinPoint.getArgs();
		
		System.out.println("Method sig: " + methodSignature);
		System.out.print("Method args: ");
		for (int i = 0; i < args.length; i++) System.out.println(args[i]);
	}
}
