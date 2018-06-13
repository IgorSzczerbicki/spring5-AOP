package com.nauka.spring5.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClientDAO {

	public List<String> getClient(String name) {
		List<String> client = new ArrayList<>();
		client.add(name);
		return client;
	}
}