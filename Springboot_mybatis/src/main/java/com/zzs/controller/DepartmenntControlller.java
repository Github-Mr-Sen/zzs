package com.zzs.controller;

import com.zzs.bean.Department;
import com.zzs.mapper.Departmentmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmenntControlller {

    @Autowired
    private Departmentmapper departmentmapper;
    @GetMapping("/dept/{id}")
    public Department depts(@PathVariable("id") Integer integer) {

        return departmentmapper.getdep(integer);
    }

    @GetMapping("/dept")
    public Department insertdepts(Department department) {
       departmentmapper.adddept(department);
        return department;
    }


}
