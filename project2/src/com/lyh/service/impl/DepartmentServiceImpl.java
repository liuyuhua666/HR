package com.lyh.service.impl;

import com.lyh.dao.DepartmentMapper;
import com.lyh.model.Department;
import com.lyh.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> allDepartment() {
        return departmentMapper.allDepartment();
    }

    @Override
    public boolean addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentMapper.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Department department) {
        return departmentMapper.deleteDepartment(department);
    }
}
