package com.infogalaxy.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infogalaxy.springdemo.entity.DepartmentEntity;
import com.infogalaxy.springdemo.model.DepartmentModel;

@Service
public class DepartmentService {

   List<DepartmentEntity> depList = new ArrayList<>();
   DepartmentEntity depEntity = new DepartmentEntity();
  
    public List<DepartmentEntity> getdeps() {
    	
        return depList;
    }
    
    
  
    public void adddep(DepartmentModel depmodel) {

  
        depEntity.setDepartmentName(depmodel.getDepartmentName());
        depEntity.setManagerId(depmodel.getManagerId());
        depEntity.setDescription(depmodel.getDescription());

        depList.add(depEntity);
    }
}
