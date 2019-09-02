package com.example.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectFirst {

	@Before("execution(public void com.example.demo.aop.dao.AopDao.printData())")
	public void firstAspect() {
		System.out.println("This is the first Aspect Ever@@@@@@@@@@@@$#####%$%^^^^^^");
		
	}
}
