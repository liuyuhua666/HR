package com.lyh.service;

import com.lyh.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> allDepartment();
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
}
