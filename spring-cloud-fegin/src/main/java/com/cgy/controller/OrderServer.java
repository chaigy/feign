package com.cgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgy.api.MemberService;

@RestController
public class OrderServer {
	
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/get")
	public String server() {
		
		String result = service.get();
		
		return result;
	}
}
