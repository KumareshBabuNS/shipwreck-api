package com.dadonas.crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping("/")
	public String load() {
		return "Hello Spring Controller!!!";
	}

}
