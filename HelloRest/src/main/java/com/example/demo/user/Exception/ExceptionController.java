package com.example.demo.user.Exception;

import java.awt.geom.Area;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class ExceptionController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		
		UserCustonException userCustonException = new UserCustonException(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(userCustonException, HttpStatus.BAD_REQUEST);
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		UserCustonException userCustonException = new UserCustonException(new Date(), "You are Seeing this because you entered data in Wrong Format" , ex.getBindingResult().toString());
		
		return new ResponseEntity<>(userCustonException, HttpStatus.BAD_REQUEST);
	}
	
	
		
}
