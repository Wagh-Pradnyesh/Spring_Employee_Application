package com.infogalaxy.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.springdemo.entity.EmpEntity;
import com.infogalaxy.springdemo.model.EmpModel;

public class EmpService {
	
	
	List<EmpEntity> emplist = new ArrayList<>();
	EmpEntity empEntity = new EmpEntity();
	

		public List<EmpEntity> getAllEmp()
		{
			return emplist;
		}
		
		public void addNewEmp(EmpModel empmodel)
		{
			
			
			empEntity.setId(empmodel.getId());
			empEntity.setName(empmodel.getName());
			empEntity.setEmail(empmodel.getEmail());
			empEntity.setMobno(empmodel.getMobno());
			emplist.add(empEntity);
		}
		
}
