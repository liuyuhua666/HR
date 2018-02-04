package com.lyh.controller;

import com.lyh.model.Employee;
import com.lyh.model.Guest;
import com.lyh.model.Recruitment;
import com.lyh.service.EmployeeService;
import com.lyh.service.GuestService;
import com.lyh.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GuestController {
    @Resource
    private GuestService guestService;

    @Resource
    private RecruitmentService recruitmentService;

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/toLogin")
    public String toLogin(Guest guest, Employee employee,HttpSession session) throws Exception{
        employee.setE_name(guest.getG_name());
        employee.setE_password(guest.getG_password());
        Employee employee1=employeeService.findEmployee(employee);
        if(null!=employee1){
            session.setAttribute("employee",employee1);
            return "employeeMain";
        }
        List<Guest> guestList=guestService.findGuests();
        if(guestList.size()>0){
            for(Guest guest1:guestList){
                if(guest.getG_name().equals(guest1.getG_name())&&guest.getG_password().equals(guest1.getG_password())){
                    List<Recruitment> recruitmentList=recruitmentService.recruitments();
                    session.setAttribute("recruitmentList",recruitmentList);
                    session.setAttribute("guest",guest1);
                    return "main";
                }
            }
        }
        return "../../index";
    }

    @RequestMapping("/toRegister")
    public String toRegister()throws Exception{
        return "register";
    }

    @RequestMapping("/register")
    public String register(Guest guest) throws Exception{
        guest.setG_applicationstatus(0);
        if(guestService.addGuest(guest)){
            return "../../index";
        }
        return "register";
    }

    @RequestMapping("/toMain")
    public String toMain()throws Exception{
        return "main";
    }
}
