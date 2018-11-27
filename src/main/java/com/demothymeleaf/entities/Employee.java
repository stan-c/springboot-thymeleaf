package com.demothymeleaf.entities;

import java.util.Date;


public class Employee extends BasicDomain{

    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Long departmentId;
    /***
     *  @DateTimeFormat(pattern = "yyyy-MM-dd")
     *  springboot 配置文件中使用了：
     *  ## 时间格式处理 spring.mvc.date-format=yyyy-MM-dd HH:mm:ss ； 所以不配置。
     */
    private Date birth;

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

    public Employee(Long id, Date createdDate, Date lastModifiedDate, int version, String lastName, String email, Integer gender, Long departmentId, Date birth) {
        super(id, createdDate, lastModifiedDate, version);
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentId;
        this.birth = birth;
    }

    public Employee(String lastName, String email, Integer gender, Long departmentId, Date birth) {
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.departmentId = departmentId;
        this.birth = birth;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", departmentId=" + departmentId +
                ", birth=" + birth +
                ", id=" + id +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", version=" + version +
                '}';
    }
}
