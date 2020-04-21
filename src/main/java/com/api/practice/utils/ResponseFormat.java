package com.api.practice.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import lombok.Getter;

@Getter
public class ResponseFormat {
	private Object data;
	private List<String> errors;
	
	
	public ResponseFormat of(Object data) {
		this.data = data;
		return this;
	}
	
	public ResponseFormat of(Object data, Exception error) {
		this.data = data;
		return this;
	}
	
}
