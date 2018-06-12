package com.nauka.spring5.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nauka.spring5.aop.dao.AccountDAO;
import com.nauka.spring5.aop.dao.MembershipDAO;

public class AopMain {

	public static void main(String[] args) {
		
		//czytaj konfiguracje
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		//pobranie beana
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
	
		//wykonanie metod
		//dodawanie kont
		accountDAO.addAccount();
		membershipDAO.addAccount();
		
		//kasowanie kont
		System.out.println("\n");
		accountDAO.deleteAccount();
		membershipDAO.deleteAccount();
		
		//aktualizowanie danych
		System.out.println("\n");
		accountDAO.updateName();;
		membershipDAO.updateAccount();
		membershipDAO.updateAdrress();
		
		//zamkni�cie kontextu
		context.close();
	}
}