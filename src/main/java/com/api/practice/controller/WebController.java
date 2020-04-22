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
public class WebController {
	
	@GetMapping("/")
	public ResponseEntity<ResponseFormat> main() {
		ResponseFormat res = new ResponseFormat().of("테스트입니다.");
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("/errorTest")
	public ResponseEntity<ResponseFormat> error() throws NullPointerException {
		String[] j = {"1"};
		j[1] = "2";
		ResponseFormat res = new ResponseFormat().of("테스트입니다.");
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
