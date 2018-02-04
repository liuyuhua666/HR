package com.lyh.controller;

import com.lyh.model.Department;
import com.lyh.model.Job;
import com.lyh.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JobController {
    @Resource
    private JobService jobService;

    @RequestMapping("/toJob")
    public String toJob(Department department, Job job, HttpSession session)throws Exception{
        job.setJ_did(department.getD_id());
        List<Job> jobList=jobService.allJobByDid(job);
        session.setAttribute("jobList",jobList);
        return "job";
    }
}
