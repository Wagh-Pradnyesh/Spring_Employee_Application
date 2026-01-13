package com.infogalaxy.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.springdemo.entity.EmpEntity;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {
	
	@GetMapping
	public String demo() {
	return "Hii Emplyoee";	
	}
	
	@GetMapping("/empid")
	public String empId()
	{
		return demo()+"\n This Is Your Info\n"+getEmp();
	}
	
	
	@GetMapping("/getemp")
	public List<EmpEntity> getEmp()
	{
		List<EmpEntity> emplist = new ArrayList();
		
		
		EmpEntity empEntity = new EmpEntity();
		empEntity.setId(101);
		empEntity.setName("\nNanesh");
		empEntity.setEmail("\nnanesh@gmail.com");
		empEntity.setMobno("\n1122334455");
		
		
		EmpEntity empEntity2 = new EmpEntity();
		empEntity2.setId(102);
		empEntity2.setName("\nMahesh");
		empEntity2.setEmail("\nMaHesh@gmail.com");
		empEntity2.setMobno("\n1232334455");
		
		emplist.add(empEntity);
		emplist.add(empEntity2);
		return emplist;
	}
	
 
	
}
