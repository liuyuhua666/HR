package com.lyh.dao;

import com.lyh.model.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> allDepartment();//��ѯ���еĲ���
    boolean addDepartment(Department department);//����µĲ���
    boolean updateDepartment(Department department);//�޸Ĳ���
    boolean deleteDepartment(Department department);//ɾ������
}
