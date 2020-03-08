package com.zzs.mapper;

import com.zzs.bean.Employee;

public interface EmployeeMapper {

    public void insertEmp(Employee employee);

    public Employee geremp(Integer id);
}
