package com.example.demo.user;

import java.net.URI;
import java.security.Provider.Service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public User getOneUser(@PathVariable int empId) {
		int empId1 = empId;
		return userDaoServices.getOneUser( empId1);
	}
	
	
	//User userinSer = new User("raju",5, new Date());
	
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		User savedUser = userDaoServices.addUser(user);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getEmpId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	
	
}