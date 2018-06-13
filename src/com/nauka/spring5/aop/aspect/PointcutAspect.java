package com.nauka.spring5.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {

	//zdefiniowanie wyrazenia Pointcut
	@Pointcut("execution(* com.nauka.spring5.aop.dao.CompanyDAO.*(..))")
	public void forDaoPackage() {};
	
	@Pointcut("execution(* com.nauka.spring5.aop.dao.CompanyDAO.get*(..))")
	public void forGetters() {}
	
	@Pointcut("execution(* com.nauka.spring5.aop.dao.CompanyDAO.set*(..))")
	public void forSetters() {}
	
	//zastosowanie wczesniej zdefiniowanego wyrazenia
	@Before("forDaoPackage()")
	public void pointcutTest() {
		System.out.println("><><><>< Pointcut declaration test");
	}
	
	//zastosowanie wczesniej zdefiniowanego wyrazenia
	@Before("forDaoPackage() && !(forGetters() || forSetters())")
	public void pointcutTestNoGetSet() {
		System.out.println("><><><>< Pointcut declaration test not for getters nor setters");
	}
}