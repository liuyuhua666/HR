package com.lyh.service;

import com.lyh.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findEmployee(Employee employee);//根据员工姓名和密码查询
    Employee findEmployeeById(Employee employee);//根据员工id查询
    List<Employee> findEmployeeByJname(Employee employee);//根据职位名查询
    List<Employee> employeelist();//查询所有的员工
    boolean addEmployee(Employee employee);//添加新的员工
    boolean updateEmployee(Employee employee);//修改员工信息
}
