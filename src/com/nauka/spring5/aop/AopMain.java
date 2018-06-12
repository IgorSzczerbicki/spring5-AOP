package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nauka.spring5.aop.dao.AccountDAO;
import com.nauka.spring5.aop.dao.MembershipDAO;
import com.nauka.spring5.aop.domain.Client;

public class AopMain {

	public static void main(String[] args) {
		
		//czytaj konfiguracje
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		//pobranie beana
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
	
		//wykonanie metod
		//dodawanie
		accountDAO.addAccount();
		membershipDAO.addAccount();
		accountDAO.addClient(new Client());
		
		//kasowanie kont
		System.out.println("\n");
		accountDAO.deleteAccount();
		membershipDAO.deleteAccount();
		
		//aktualizowanie danych
		System.out.println("\n");
		accountDAO.updateName();
		accountDAO.updateCity();
		membershipDAO.updateAccount();
		membershipDAO.updateAdrress();
		
		//zamkniêcie kontextu
		context.close();
	}
}