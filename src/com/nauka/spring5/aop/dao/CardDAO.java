package com.nauka.spring5.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class CardDAO {

	public String getCard() {
		return "testCard";
	}
}