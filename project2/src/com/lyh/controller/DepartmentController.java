package com.lyh.controller;

import com.lyh.model.Department;
import com.lyh.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/toDepartment")
    public String toDepartmentJob(HttpSession session)throws Exception{
        List<Department> departmentList=departmentService.allDepartment();
        session.setAttribute("departmentList",departmentList);
        return "department";
    }
}
