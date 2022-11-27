package com.javacourse.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Computer";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Laptop";
	}
}
