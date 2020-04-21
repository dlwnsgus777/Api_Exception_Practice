package com.api.practice.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.practice.utils.ResponseFormat;

import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
public class WebController {
	
	@GetMapping("/")
	public ResponseEntity<ResponseFormat> main() {
		ArrayList<String> test = new ArrayList<>();
		test.add("test1");
		test.add("test2");
		test.add("test3");
		test.add("test4");
		ResponseFormat res = new ResponseFormat().of(test);
//		System.out.println(res.getData());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public ResponseEntity<ResponseFormat> mainTest() {
		Map<String, Object> test1 = new HashMap<String, Object>();
		ArrayList<String> test2 = new ArrayList<>();
		
		test2.add("test1");
		test2.add("test2");
		test2.add("test3");
		test2.add("test4");
		
		test1.put("test1", "Test");
		test1.put("test2", test2);
		
		ResponseFormat res = new ResponseFormat().of(test1);
		
//		System.out.println(res.getData());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
//	@GetMapping("/")
//	public ResponseEntity<Map<String, Object>> main() {
//		ResponseWrapper<String> res = new ResponseWrapper<String>("main return");
//		return new ResponseEntity<>(res.of("main return"),HttpStatus.OK);
//	}
	
//	@GetMapping("/")
//	public ResponseWrapper main() {
//		ResponseWrapper<String> res = new ResponseWrapper<String>("main return");
//		return res;
//	}
}
