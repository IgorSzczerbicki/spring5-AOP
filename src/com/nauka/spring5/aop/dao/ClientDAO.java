package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClientDAO {

	public String getClient(String name) {
		return name;
	}
}