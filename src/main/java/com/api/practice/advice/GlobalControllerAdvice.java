package com.api.practice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.practice.utils.ResponseFormat;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	@ExceptionHandler(IllegalAccessException.class)
	protected ResponseEntity<ResponseFormat> HandlerIllegalAccessException(IllegalAccessException e) {
		System.out.println("IllegalAccessException error");
		ResponseFormat res = new ResponseFormat().of(e);
		
		return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NullPointerException.class)
	protected ResponseEntity<ResponseFormat> HandlerNullPointerException(NullPointerException e) {
		System.out.println("NullPointerException error");
		ResponseFormat res = new ResponseFormat().of(e);
		
		return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<ResponseFormat> HandlerException(Exception e) {
		System.out.println("Exception");
		ResponseFormat res = new ResponseFormat().of(e);;
		
		return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
