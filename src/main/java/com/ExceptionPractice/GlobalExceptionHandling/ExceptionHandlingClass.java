package com.ExceptionPractice.GlobalExceptionHandling;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ExceptionPractice.CustomException.ObjectNotFoundException;

@RestControllerAdvice
public class ExceptionHandlingClass {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public String nullObj(ObjectNotFoundException npe) {
		return "adf ";
	}
	
}
