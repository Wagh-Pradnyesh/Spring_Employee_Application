package com.infogalaxy.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.springdemo.entity.EmpEntity;

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
	
	
	@GetMapping("/getemp")
	public EmpEntity getEmp()
	{
		EmpEntity empEntity = new EmpEntity();
		empEntity.setId(101);
		empEntity.setName("Nanesh");
		empEntity.setEmail("nanesh@gmail.com");
		empEntity.setMobno("1122334455");
		return empEntity;
	}
	
 
	
}
