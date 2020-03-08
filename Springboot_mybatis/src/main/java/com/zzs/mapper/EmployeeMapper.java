package com.zzs.mapper;

import com.zzs.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public void insertEmp(Employee employee);

    public Employee geremp(Integer id);
}
