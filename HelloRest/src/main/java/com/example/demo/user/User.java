package com.example.demo.user;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class User {

	private String name;
	
	@Id
	@GeneratedValue
	private Integer empId;
	private Date dob;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the counter
	 */
	public Integer getEmpId() {
		return empId;
	}
	
	/**
	 * @param counter the counter to set
	 */
	public void setEmpId(Integer counter) {
		this.empId = counter;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	/**
	 * @param name
	 * @param counter
	 * @param dob
	 */
	public User(String name, int counter, Date dob) {
		super();
		this.name = name;
		this.empId = counter;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", empId=" + empId + ", dob=" + dob + "]";
	}
}
