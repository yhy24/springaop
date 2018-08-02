package com.spring.aop.bean;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = -5046972860468900599L;

    private Integer id;
    private String username;
    private String password;
    private String intest;
    private String phone;
    private String email;
    private Integer age;
    private String mark;
    private String code;
    private String gender;
    private String indicSeq;
    private String create_date;
    private String modify_date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntest() {
        return intest;
    }

    public void setIntest(String intest) {
        this.intest = intest;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndicSeq() {
        return indicSeq;
    }

    public void setIndicSeq(String indicSeq) {
        this.indicSeq = indicSeq;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", intest='" + intest + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mark='" + mark + '\'' +
                ", code='" + code + '\'' +
                ", gender='" + gender + '\'' +
                ", indicSeq='" + indicSeq + '\'' +
                ", create_date='" + create_date + '\'' +
                ", modify_date='" + modify_date + '\'' +
                '}';
    }
}
