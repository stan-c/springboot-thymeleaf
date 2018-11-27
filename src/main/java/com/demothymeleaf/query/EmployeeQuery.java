package com.demothymeleaf.query;

import com.demothymeleaf.entities.BasicDomain;

import java.util.Date;


public class EmployeeQuery extends BasicDomain {

    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Long departmentId;
    private Date birth;

    /**
     *  关联部门ID
     */
    private String departmentName;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


}
