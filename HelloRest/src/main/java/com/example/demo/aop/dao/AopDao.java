package com.example.demo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AopDao {

	public void printData() {
		
		System.out.println(getClass() +" Hello this is DaO class ");
	}
	
}
