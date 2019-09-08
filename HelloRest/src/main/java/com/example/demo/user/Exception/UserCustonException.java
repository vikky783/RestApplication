package com.example.demo.user.Exception;

import java.util.Date;

public class UserCustonException {
	 private Date timeStamp;
	 private String message;
	 private String Details;
	/**
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return Details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		Details = details;
	}
	/**
	 * @param timeStamp
	 * @param message
	 * @param details
	 */
	public UserCustonException(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		Details = details;
	}
	 

}
