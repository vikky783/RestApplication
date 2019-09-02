package com.example.demo.user;

import java.net.URI;
import java.security.Provider.Service;
import java.util.Date;
import java.util.List;

import org.hibernate.jpa.internal.enhance.EnhancingClassTransformerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

	@Autowired 
	private UserDaoServices userDaoServices;
	
	@GetMapping("/allUser")
	public List<User> getAllUser(){
		return userDaoServices.getAllUser();
	}
	
	@GetMapping("/aUser/{empId}")
	@ResponseBody
	public User getOneUser(@PathVariable int empId) {
		int empId1 = empId;
		return userDaoServices.getOneUser( empId1);
	}
	
	
	//User userinSer = new User("raju",5, new Date());
	
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userDaoServices.addUser(user);
		
		//EnhancingClassTransformerImpl the Post method to return correct HTTP status Code and loaction
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getEmpId()).toUri();
		
		return ResponseEntity.created(location).header("My First Header", "Hello How are you").body("Hello Brother");
		
	}
	
	
	
}
