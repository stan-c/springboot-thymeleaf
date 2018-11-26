package com.demothymeleaf.query;

import com.demothymeleaf.entities.BasicDomain;
import lombok.Data;

import java.util.Date;

@Data
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

}
