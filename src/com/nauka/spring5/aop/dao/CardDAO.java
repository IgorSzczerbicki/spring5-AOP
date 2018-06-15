package com.nauka.spring5.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CardDAO {

	public String getCard() {
		return "testCard";
	}
	
	public String exceptionOne() {
		Random rand = new Random();
		int rnd = rand.nextInt(10);
		if (rnd > 5) throw new RuntimeException("rnd: " + rnd);
		return "excOneDone";
	}
}