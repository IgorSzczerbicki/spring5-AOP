package com.nauka.spring5.aop;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nauka.spring5.aop.dao.CardDAO;

public class AroundMain {
	
	private static Logger log = Logger.getLogger(AroundMain.class.getName());

	public static void main(String[] args) {
		
		log.info("getting config");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		log.info("getting bean");
		CardDAO cardDAO = context.getBean("cardDAO", CardDAO.class);
		
		log.info("calling getCard");
		cardDAO.getCard();
		
		log.info("calling exceptionOne");
		cardDAO.exceptionOne();
		
		log.info("calling exceptionTwo");
		cardDAO.exceptionTwo();
		
		log.info("closing context");
		context.close();
	}
}