package com.infogalaxy.springdemo.controller;

import java.util.List;



import org.springframework.web.bind.annotation.*;

import com.infogalaxy.springdemo.entity.DepartmentEntity;

import com.infogalaxy.springdemo.model.DepartmentModel;

import com.infogalaxy.springdemo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    DepartmentService departmentService = new DepartmentService();

    @GetMapping("/getdep")
    public List<DepartmentEntity> getdep() {
        return departmentService.getdeps();
    }
    
    
    @PostMapping("/adddep")
    public void addDepartment(@RequestBody DepartmentModel departmentModel) {
        departmentService.adddep(departmentModel);
    }

}
