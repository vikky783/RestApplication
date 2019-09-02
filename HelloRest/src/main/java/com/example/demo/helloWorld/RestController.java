package com.example.demo.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

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

}
