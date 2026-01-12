package com.infogalaxy.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {
	
	@GetMapping
	public String demo() {
	return "Hii Web"+empId();	
	}
	
	@GetMapping("/empid")
	public String empId()
	{
		return "This Is Your Emp ID";
	}
 
	
}
