package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("====> Advice @Before beforeAddAccountAdvice");
	}
	
	@Before("execution(public void com.nauka.spring5.aop.dao.MembershipDAO.deleteAccount())")
	public void beforeDeleteAccountAdvice() {
		System.out.println("====> Advice @Before beforeDeleteAccountAdvice");
	}
	
	@Before("execution(public void update*())")
	public void beforeUpdateAdvice() {
		System.out.println("====> Advice @Before beforeUpdateAdvice");
	}
	
	@Before("execution(String *())")
	public void beforeStringReturnAdvice() {
		System.out.println("====> Advice @Before beforeStringReturnAdvice");
	}
}