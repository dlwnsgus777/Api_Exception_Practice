package com.api.practice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.api.practice.advice.GlobalControllerAdvice;

@RunWith(MockitoJUnitRunner.class)
public class WebControllerTest {
	
	@InjectMocks
	private WebController controller;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setControllerAdvice(new GlobalControllerAdvice()).build();
	}
	
	@Test
	public void 에러가_없으면_Errors_는_null() throws Exception{
		mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.data", Matchers.is("테스트입니다.")))
			.andExpect(jsonPath("$.errors", Matchers.nullValue()));
	}
	
	@Test
	public void 오류처리_테스트() throws Exception {
		mockMvc.perform(get("/errorTest"))
		.andExpect(status().is5xxServerError())
		.andExpect(jsonPath("$.data", Matchers.is("오류가 발생했습니다.")))
		.andExpect(jsonPath("$.errors", Matchers.notNullValue()));
		
	}

}
