package com.infogalaxy.springdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.springdemo.entity.EmpEntity;
import com.infogalaxy.springdemo.model.EmpModel;
import com.infogalaxy.springdemo.service.EmpService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController 
{
	
	EmpService empService = new EmpService();
	
	@GetMapping("/getemp")
	public List<EmpEntity> getEmp()
	{
		return empService.getAllEmp();
	}
	
	
	@PostMapping("/addemp")
	public void  addEmployee(@RequestBody EmpModel empmodel) {
		
	    empService.addNewEmp(empmodel);
	   
	}



 
	
}
