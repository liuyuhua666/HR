package com.lyh.dao;

import com.lyh.model.Job;

import java.util.List;

public interface JobMapper {
    List<Job> allJobByDid(Job job);//��ѯ���е�ְλ
    boolean addJob(Job job);//����µ�ְλ
    boolean updateJob(Job job);//�޸�ְλ
    boolean deleteJob(Job job);//ɾ��ְλ
}
