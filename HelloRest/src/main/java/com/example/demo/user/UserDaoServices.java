package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;



@Component
public class UserDaoServices {

	private static List<User> userList = new ArrayList<>();
	
	private static Integer empId = 3;
	
	static {
		userList.add(new User("Vikky", 1, new Date()));
		userList.add(new User("Raj", 2, new Date()));
		userList.add(new User("Puja", 3, new Date()));
	}
	
	public List<User> getAllUser(){
		return userList;
	}
	
	public  User getOneUser(int empId) {
		
		this.empId= empId;
		for (User user : userList) {
			if (user.getEmpId()==empId) {
				return user;
				
			}
		}
		return null;
		
	}
	
	public User addUser(User users) {
		if(users.getEmpId()==0) {
			System.out.println("User Id is blank");
			users.setEmpId(++empId);
		}
		userList.add(users);
		System.out.println(users);
		return users;
	}
	
	
public  User deleteOne(int empId) {
		
	Iterator<User> userIterator = userList.iterator();
	while (userIterator.hasNext()) {
		User user = (User) userIterator.next();
		
		if (user.getEmpId()==empId) {
			userList.remove(empId);
			return user;
		}
		
	}
		
	return null;
	}

	
	
}
