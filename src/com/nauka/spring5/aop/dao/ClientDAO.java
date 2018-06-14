package com.nauka.spring5.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClientDAO {

	public List<String> getClient(String n) throws Exception {
		String name = testName(n);
		List<String> client = new ArrayList<>();
		client.add(name);
		return client;
	}
	
	public String testName(String name) throws Exception {
		if ("rzuc".equals(name)) {
			throw new RuntimeException();
		} else return name;
	}
}