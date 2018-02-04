package com.lyh.model;

import java.io.Serializable;

public class Department implements Serializable{
    private int d_id;//主
    private String d_name;//部门名
    private String d_createtime;//部门创建时间

    public Department() {
    }

    public Department(int d_id, String d_name, String d_createtime) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_createtime = d_createtime;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_createtime() {
        return d_createtime;
    }

    public void setD_createtime(String d_createtime) {
        this.d_createtime = d_createtime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_createtime='" + d_createtime + '\'' +
                '}';
    }
}
