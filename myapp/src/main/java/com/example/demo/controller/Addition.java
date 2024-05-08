package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
	
	@GetMapping("/add")
	public int add() {
		int a=2;
		int b=3;
		int c=a+b;
		return c;
		
	}

}
