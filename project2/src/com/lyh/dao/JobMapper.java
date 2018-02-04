package com.lyh.dao;

import com.lyh.model.Job;

import java.util.List;

public interface JobMapper {
    List<Job> allJobByDid(Job job);//查询所有的职位
    boolean addJob(Job job);//添加新的职位
    boolean updateJob(Job job);//修改职位
    boolean deleteJob(Job job);//删除职位
}
