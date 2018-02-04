package com.lyh.dao;

import com.lyh.model.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> allDepartment();//查询所有的部门
    boolean addDepartment(Department department);//添加新的部门
    boolean updateDepartment(Department department);//修改部门
    boolean deleteDepartment(Department department);//删除部门
}
