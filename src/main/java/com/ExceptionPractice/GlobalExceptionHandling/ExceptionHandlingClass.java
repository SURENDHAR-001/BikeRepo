package com.ExceptionPractice.GlobalExceptionHandling;


import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ExceptionPractice.CustomException.ObjectNotFoundException;

@RestControllerAdvice
public class ExceptionHandlingClass {
	@ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<Object> objExp(ObjectNotFoundException e) {
	return new ResponseEntity<Object>("no object found",HttpStatus.BAD_REQUEST);   
}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> noSuch(NoSuchElementException ne) {
		return new ResponseEntity<Object>("no element found",HttpStatus.BAD_REQUEST);
	}
	
}
