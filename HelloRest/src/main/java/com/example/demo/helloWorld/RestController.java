package com.example.demo.helloWorld;

import java.util.Locale;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.demo.HelloRestApplication;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("This Hello From hello bean");
		
	}
	@GetMapping(path="/hello/path/{name}")
	public HelloWorldBean HelloWorldPathVar(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("This is Hello From Vikky %s", name ));
		
	}
	
	@GetMapping(path = "/hello-world-internationalized")
	
	public String helloWorldInternationalized(@RequestHeader(name = "Accept-language", required = false) Locale locale) {
		
		return messageSource.getMessage("good.morning.message", null, locale);
	}

}
