package com.api.practice.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

public class ResponseWrapper<T> {
	private T data;
	private List<String> erros;
	
//	public Map<String, Object> of(Object data) {
//		Map<String, Object> returnJson = new HashMap<>();
//		returnJson.put("data", data);
//		returnJson.put("erros", erros);
//		return returnJson;
//	}
	
	
	public static ResponseEntity<Map<String, Object>> of(Object data) {
		Map<String, Object> returnJson = new HashMap<>();
		returnJson.put("data", data);
		returnJson.put("erros", erros);
		return returnJson;
	}
	
}
