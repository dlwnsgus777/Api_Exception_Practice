package com.api.practice.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.practice.utils.ResponseWrapper;

import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
public class WebController {
	
//	@GetMapping("/")
//	public ResponseEntity<Map<String, Object>> main() {
//		ResponseWrapper<String> res = new ResponseWrapper<String>("main return");
//		return new ResponseEntity<>(res.of("main return"),HttpStatus.OK);
//	}
	
	@GetMapping("/")
	public ResponseWrapper main() {
		ResponseWrapper<String> res = new ResponseWrapper<String>("main return");
		return res;
	}
}
