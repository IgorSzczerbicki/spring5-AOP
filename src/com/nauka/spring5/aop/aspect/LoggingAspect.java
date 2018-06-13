package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	//przed metoda addAcount() w dowolnej klasie
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("====> Advice @Before beforeAddAccountAdvice");
	}
	
	//przed metoda deleteAccount() w klasie com.nauka.spring5.aop.dao.MembershipDAO
	@Before("execution(public void com.nauka.spring5.aop.dao.MembershipDAO.deleteAccount())")
	public void beforeDeleteAccountAdvice() {
		System.out.println("====> Advice @Before beforeDeleteAccountAdvice");
	}
	
	//przed metoda update*() w dowolnej klasie
	@Before("execution(public void update*())")
	public void beforeUpdateAdvice() {
		System.out.println("====> Advice @Before beforeUpdateAdvice");
	}
	
	//przed dowolna metoda w dowlnej klasie zwracajaca String
	@Before("execution(String *())")
	public void beforeStringReturnAdvice() {
		System.out.println("====> Advice @Before beforeStringReturnAdvice");
	}
	
	//przed metoda addClient() przyjmujaca parametr typu com.nauka.spring5.aop.domain.Client
	@Before("execution(* addClient(com.nauka.spring5.aop.domain.Client))")
	public void beforeAddClientAdvice() {
		System.out.println("====> Advice @Before beforeAddClientAdvice");
	}
	
	//przed dowolna metoda z pakietu com.nauka.spring5.aop.dao
	@Before("execution(* com.nauka.spring5.aop.dao.*.*(..))")
	public void beforeInPackageAdvice() {
		System.out.println("====> Advice @Before beforeInPackageAdvice");
	}
}