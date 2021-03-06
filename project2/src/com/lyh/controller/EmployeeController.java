package com.lyh.controller;

import com.lyh.model.Employee;
import com.lyh.model.Guest;
import com.lyh.service.EmployeeService;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/toAddEmployees")
    public String toAddEmployees(HttpSession session)throws Exception{
        List<Employee> employeeList=employeeService.employeelist();
        session.setAttribute("employeeList",employeeList);
        return "addEmployees";
    }

    @RequestMapping("/toAddEmployee")
    public String toAddEmployee(Employee employee,HttpSession session)throws Exception{
        Employee employee1=employeeService.findEmployeeById(employee);
        session.setAttribute("employee",employee1);
        return "addEmployee";
    }

    @RequestMapping("/addEmployee")
    public String addEmployee(Employee employee)throws Exception{
        Employee employee1=employeeService.findEmployeeById(employee);
        employee1.setE_hiretime(employee.getE_hiretime());
        employee1.setE_workstarttime(employee.getE_workstarttime());
        employee1.setE_workendtime(employee.getE_workendtime());
        employee1.setE_workstatus(2);
        if(employeeService.updateEmployee(employee1)){
            return "addEmployees";
        }
        return "addEmployee";
    }

    @RequestMapping("/toPersonalInfo")
    public String toPersonalInfo(HttpSession session)throws Exception{
        return "personalInfo";
    }

    @RequestMapping("/returnEmployeeMain")
    public String returnEmployeeMain()throws Exception{
        return "employeeMain";
    }
}
