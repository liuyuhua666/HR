package com.lyh.model;

import java.io.Serializable;

public class Job implements Serializable{
    private int j_id;//��
    private String j_name;//ְλ��
    private int j_did;//ְλ���ڵĲ���
    private String j_createtime;//ְλ����ʱ��

    public Job() {
    }

    public Job(int j_id, String j_name, int j_did, String j_createtime) {
        this.j_id = j_id;
        this.j_name = j_name;
        this.j_did = j_did;
        this.j_createtime = j_createtime;
    }

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
    }

    public String getJ_name() {
        return j_name;
    }

    public void setJ_name(String j_name) {
        this.j_name = j_name;
    }

    public int getJ_did() {
        return j_did;
    }

    public void setJ_did(int j_did) {
        this.j_did = j_did;
    }

    public String getJ_createtime() {
        return j_createtime;
    }

    public void setJ_createtime(String j_createtime) {
        this.j_createtime = j_createtime;
    }

    @Override
    public String toString() {
        return "Job{" +
                "j_id=" + j_id +
                ", j_name='" + j_name + '\'' +
                ", j_did='" + j_did + '\'' +
                ", j_createtime='" + j_createtime + '\'' +
                '}';
    }
}
