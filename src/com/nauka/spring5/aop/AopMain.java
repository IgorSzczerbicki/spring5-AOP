package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nauka.spring5.aop.dao.AccountDAO;

public class AopMain {

	public static void main(String[] args) {
		
		//czytaj konfiguracje
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		//pobranie beana
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//wykonanie metod
		accountDAO.addAccount();
		
		//zamkniêcie kontextu
		context.close();
	}
}