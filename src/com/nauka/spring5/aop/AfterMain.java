package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nauka.spring5.aop.dao.ClientDAO;

public class AfterMain {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		ClientDAO clientDAO = context.getBean("clientDAO", ClientDAO.class);
		
		try {
			System.out.println(clientDAO.getClient("Testowy Klient"));
			System.out.println(clientDAO.getClient("rzuc"));
		} catch (Exception exc) {
			System.out.println("Exception: " + exc);
		}
		
		finally {
			context.close();
		}
	}
}