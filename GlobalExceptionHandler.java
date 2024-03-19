package com.webapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<?>resourceNotFound(
			ResourseNotFoundException e,
			WebRequest webRequest
			){
		
	return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
@ExceptionHandler(Exception.class)
public ResponseEntity<?>exceptionHandler(
		Exception e,
		WebRequest webRequest
		){
	
return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
}
	
}
