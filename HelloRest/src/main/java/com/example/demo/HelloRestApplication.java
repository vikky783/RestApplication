package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.aop.dao.AopDao;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HelloRestApplication {
	
	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(HelloRestApplication.class, args);
		//@Autowired
		//AopDao aopDao = new AopDao();
		//aopDao.printData();
		//HelloRestApplication helloRestApplication = new HelloRestApplication();
		
		
	}

	
	}
