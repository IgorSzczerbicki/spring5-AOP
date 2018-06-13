package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class CompanyDAO {

	public void addCompany() {
		System.out.println(getClass() + " adding company");
	}
	
	public void setCompany() {
		System.out.println(getClass() + " setting companyt");
	}
	
	public void getCompany() {
		System.out.println(getClass() + " getting company");
	}
}