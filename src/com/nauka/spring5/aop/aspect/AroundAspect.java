package com.nauka.spring5.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {
	
	private static Logger log = Logger.getLogger(AroundAspect.class.getName());
	
	@Around("execution(String com.nauka.spring5.aop.dao.CardDAO.getCard(..))")
	public Object getCardExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		
		long begin = System.currentTimeMillis();
		
		//wykonanie metody
		Object result = proceedingJoinPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		long dur = end - begin;
		log.info("$$$$$ @Around duration: " + dur);
		
		return result;
	}
	
	@Around("execution(* com.nauka.spring5.aop.dao.CardDAO.exceptionOne(..))")
	public Object handleExceptionOne(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object result = null;
		
		try {
			result = proceedingJoinPoint.proceed();
			return result;
		} catch (Throwable exc) {
			log.info("Exception: " + exc);
			return "Exception occured";
		}
	}
}