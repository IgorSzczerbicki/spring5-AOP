package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + " adding account");
	}
	
	public void deleteAccount() {
		System.out.println(getClass() + " deleting account");
	}
	
	public void updateAccount() {
		System.out.println(getClass() + " updating account");
	}
	
	public void updateAdrress() {
		System.out.println(getClass() + " updating address");
	}
}
