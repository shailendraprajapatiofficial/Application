package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String helloworld() {
		return "Hello World";	
	}
	
	@GetMapping("/add/{A}/{B}")
	public int add(@PathVariable int A,@PathVariable int B) {
		System.out.println(A+"============================= "+B);
		return A+B;
	}
	
	

}
