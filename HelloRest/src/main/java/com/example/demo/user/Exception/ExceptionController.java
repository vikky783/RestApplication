package com.example.demo.user.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		
		UserCustonException userCustonException = new UserCustonException(new Date(), ex.getMessage(), request.getSessionId());
		
		return new ResponseEntity<>(userCustonException, HttpStatus.BAD_REQUEST);
		
	}
		
}
