package com.nauka.spring5.mvc.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MvcAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.nauka.spring5.mvc.controller.*.*(..))")
	public void allControllers() {};
	
	@Pointcut("execution(* com.nauka.spring5.mvc.DAO.*.*(..))")
	public void allDaos() {};
	
	@Pointcut("execution(* com.nauka.spring5.mvc.service.*.*(..))")
	public void allServices() {};
	
	@Pointcut("allControllers() || allDaos() || allServices()")
	public void forAll() {};
	
	@Before("forAll()")
	public void beforeMvc(JoinPoint joinPoint) {
		logger.info("======>> @Before MVC");
		logger.info("Calling method: " + joinPoint.getSignature().toShortString());
		logger.info("Args: ");
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			logger.info("-------->" + args[i]);
		}
	}
	
	@AfterReturning(pointcut = "forAll()", 
			returning = "result")
	public void afterMvc(JoinPoint joinPoint, Object result) {
		logger.info("******>> @AfterReturning MVC");
		logger.info("Calling method: " + joinPoint.getSignature().toShortString());
		logger.info("Returning: ");
		logger.info("-------->" + result);
	}
}