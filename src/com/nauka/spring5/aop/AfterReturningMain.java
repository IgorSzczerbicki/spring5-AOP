package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nauka.spring5.aop.dao.ClientDAO;

public class AfterReturningMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		ClientDAO clientDAO = context.getBean("clientDAO", ClientDAO.class);
		
		System.out.println(clientDAO.getClient("Testowy Klient"));
		
		context.close();
	}
}