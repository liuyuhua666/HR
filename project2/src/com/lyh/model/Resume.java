package com.lyh.model;

import java.io.Serializable;

public class Resume implements Serializable{
    private int r_id;//主
    private int r_gid;//对应guest表
    private String r_name;//姓名
    private int r_age;//年龄
    private String r_ethnicity;//名族
    private int r_phone;//电话
    private int r_height;//身高
    private int r_weight;//体重
    private String r_marrige;//婚姻状态
    private String r_address;//地址
    private String r_schoolofgraduation;//毕业学校
    private String r_selfassessment;//自我评价
    private String r_intership;//实习经历
    private String r_award;//曾获奖励

    public Resume() {
    }

    public Resume(int r_id, int r_gid, String r_name, int r_age, String r_ethnicity, int r_phone, int r_height, int r_weight, String r_marrige, String r_address, String r_schoolofgraduation, String r_selfassessment, String r_intership, String r_award) {
        this.r_id = r_id;
        this.r_gid = r_gid;
        this.r_name = r_name;
        this.r_age = r_age;
        this.r_ethnicity = r_ethnicity;
        this.r_phone = r_phone;
        this.r_height = r_height;
        this.r_weight = r_weight;
        this.r_marrige = r_marrige;
        this.r_address = r_address;
        this.r_schoolofgraduation = r_schoolofgraduation;
        this.r_selfassessment = r_selfassessment;
        this.r_intership = r_intership;
        this.r_award = r_award;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getR_gid() {
        return r_gid;
    }

    public void setR_gid(int r_gid) {
        this.r_gid = r_gid;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public int getR_age() {
        return r_age;
    }

    public void setR_age(int r_age) {
        this.r_age = r_age;
    }

    public String getR_ethnicity() {
        return r_ethnicity;
    }

    public void setR_ethnicity(String r_ethnicity) {
        this.r_ethnicity = r_ethnicity;
    }

    public int getR_phone() {
        return r_phone;
    }

    public void setR_phone(int r_phone) {
        this.r_phone = r_phone;
    }

    public int getR_height() {
        return r_height;
    }

    public void setR_height(int r_height) {
        this.r_height = r_height;
    }

    public int getR_weight() {
        return r_weight;
    }

    public void setR_weight(int r_weight) {
        this.r_weight = r_weight;
    }

    public String getR_marrige() {
        return r_marrige;
    }

    public void setR_marrige(String r_marrige) {
        this.r_marrige = r_marrige;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_schoolofgraduation() {
        return r_schoolofgraduation;
    }

    public void setR_schoolofgraduation(String r_schoolofgraduation) {
        this.r_schoolofgraduation = r_schoolofgraduation;
    }

    public String getR_selfassessment() {
        return r_selfassessment;
    }

    public void setR_selfassessment(String r_selfassessment) {
        this.r_selfassessment = r_selfassessment;
    }

    public String getR_intership() {
        return r_intership;
    }

    public void setR_intership(String r_intership) {
        this.r_intership = r_intership;
    }

    public String getR_award() {
        return r_award;
    }

    public void setR_award(String r_award) {
        this.r_award = r_award;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_gid=" + r_gid +
                ", r_name='" + r_name + '\'' +
                ", r_age=" + r_age +
                ", r_ethnicity='" + r_ethnicity + '\'' +
                ", r_phone=" + r_phone +
                ", r_height=" + r_height +
                ", r_weight=" + r_weight +
                ", r_marrige='" + r_marrige + '\'' +
                ", r_address='" + r_address + '\'' +
                ", r_schoolofgraduation='" + r_schoolofgraduation + '\'' +
                ", r_selfassessment='" + r_selfassessment + '\'' +
                ", r_intership='" + r_intership + '\'' +
                ", r_award='" + r_award + '\'' +
                '}';
    }
}
