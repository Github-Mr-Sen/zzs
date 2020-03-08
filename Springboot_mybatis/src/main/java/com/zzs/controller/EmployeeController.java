package com.zzs.controller;

import com.zzs.bean.Employee;
import com.zzs.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeMapper mapper;

    @GetMapping("/emp/{id}")
    public Employee emp(@PathVariable("id") Integer id) {
        return  mapper.geremp(id);

    }
}
