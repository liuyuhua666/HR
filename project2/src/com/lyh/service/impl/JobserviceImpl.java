package com.lyh.service.impl;

import com.lyh.dao.JobMapper;
import com.lyh.model.Job;
import com.lyh.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("jobService")
public class JobserviceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;
    @Override
    public List<Job> allJobByDid(Job job) {
        return jobMapper.allJobByDid(job);
    }

    @Override
    public boolean addJob(Job job) {
        return jobMapper.addJob(job);
    }

    @Override
    public boolean updateJob(Job job) {
        return jobMapper.updateJob(job);
    }

    @Override
    public boolean deleteJob(Job job) {
        return jobMapper.deleteJob(job);
    }
}
