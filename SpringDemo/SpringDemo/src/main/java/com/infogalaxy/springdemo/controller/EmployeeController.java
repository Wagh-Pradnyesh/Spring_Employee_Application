package com.infogalaxy.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.springdemo.entity.EmpEntity;

@RestController
@RequestMapping("/empapi")
public class EmployeeController 
{
	
	List<EmpEntity> emplist = new ArrayList();
	
	@GetMapping
	public String demo() {
	return "Hii Emplyoee";	
	}
	
	@GetMapping("/getemp")
	public List<EmpEntity> getEmp()
	{
		
		
		
	EmpEntity empEntity = new EmpEntity();
		empEntity.setId(101);
		empEntity.setName("Nanesh");
		empEntity.setEmail("nanesh@gmail.com");
		empEntity.setMobno("1122334455");
		
		
		EmpEntity empEntity2 = new EmpEntity();
		empEntity2.setId(102);	
		empEntity2.setName("Mahesh");
		empEntity2.setEmail("MaHesh@gmail.com");
		empEntity2.setMobno("1232334455");
		
		emplist.add(empEntity);
		emplist.add(empEntity2);
		return emplist;
	}
	
	
	@PostMapping("/addemp")
	public void  addEmployee(@RequestBody EmpEntity empEntity) {
	    emplist.add(empEntity);
	   // return "Employee Added Successfully";
	}



 
	
}
