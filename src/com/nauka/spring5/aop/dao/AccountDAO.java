package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

import com.nauka.spring5.aop.domain.Client;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " adding account");
	}
	
	public void deleteAccount() {
		System.out.println(getClass() + " deleting account");
	}
	
	public void updateName() {
		System.out.println(getClass() + " updating name");
	}
	
	public String updateCity() {
		System.out.println(getClass() + " updating city");
		return null;
	}
	
	public void addClient(Client client) {
		System.out.println(getClass() + " adding client");
	};
}