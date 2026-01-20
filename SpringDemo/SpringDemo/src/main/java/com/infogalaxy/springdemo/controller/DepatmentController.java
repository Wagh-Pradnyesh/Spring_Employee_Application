package com.infogalaxy.springdemo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.springdemo.entity.DepartmentEntity;


@RestController
@RequestMapping("/depapi")
public class DepatmentController {

    private static List<DepartmentEntity> depList = new ArrayList<>();

    @GetMapping("/getdep")
    public List<DepartmentEntity> getDep() {
        return depList;
    }

    @PostMapping("/adddep")
    public List<DepartmentEntity> addDep() {

        DepartmentEntity dep1 = new DepartmentEntity();
        dep1.setDepartmentName("IT");
        dep1.setManagerId(103);
        dep1.setDescription("This is Department Description");

        DepartmentEntity dep2 = new DepartmentEntity();
        dep2.setDepartmentName("CS");
        dep2.setManagerId(204);
        dep2.setDescription("This is CS Department Description");

        depList.add(dep1);
        depList.add(dep2);

        return depList;
    }
}
