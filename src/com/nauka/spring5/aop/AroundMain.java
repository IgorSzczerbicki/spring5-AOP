package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nauka.spring5.aop.dao.CardDAO;

public class AroundMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		CardDAO cardDAO = context.getBean("cardDAO", CardDAO.class);
		cardDAO.getCard();
		context.close();
	}
}