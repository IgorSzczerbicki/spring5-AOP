package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " adding account");
	}
}