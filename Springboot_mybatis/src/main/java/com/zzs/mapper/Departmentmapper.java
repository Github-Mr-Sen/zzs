package com.zzs.mapper;

import com.zzs.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface Departmentmapper {

    @Select("select * from department where id = #{id}")
    public Department getdep(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")  //自增主键，绑定到实体的id属性想
    @Insert("insert into department (department_name) values (#{departmentName}) ")
    public void adddept(Department department);

    @Delete("delete from departmen where id = #{id}")
    public void deldept(Integer id);


    @Update("update department set departmentname = #{departmentName} where id = #{id}" )
    public void updatedept(Department department);
}
