package com.lyh.service;

import com.lyh.model.Job;

import java.util.List;

public interface JobService {
    List<Job> allJobByDid(Job job);
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean deleteJob(Job job);
}
