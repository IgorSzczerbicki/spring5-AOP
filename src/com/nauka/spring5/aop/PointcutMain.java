package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nauka.spring5.aop.dao.CompanyDAO;

public class PointcutMain {

	public static void main(String[] args) {
		
		//czytaj konfiguracje
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		//pobranie beana
		CompanyDAO companyDAO = context.getBean("companyDAO", CompanyDAO.class);

		//wykonywanie metod
		companyDAO.addCompany("Tesra");
		companyDAO.getCompany();
		companyDAO.setCompany();		
		
		//zamkniêcie kontextu
		context.close();
	}
}