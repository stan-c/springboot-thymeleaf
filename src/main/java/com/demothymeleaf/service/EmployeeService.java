package com.demothymeleaf.service;

import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.query.EmployeeQuery;

import java.util.List;

public interface EmployeeService {

    void saveEmp(Employee employee);

    /**
     *  根据 createdDate 倒叙排列
     * @return
     */
    List<EmployeeQuery> getAll();

    Employee get(Long id);

    void delete(Long id);

    void updateEmp(Employee employee);

    /**
     * 通过 DepartmentId 部门ID 获取对应的用户
     * @param departmentId
     * @return
     */
    Employee getDepartmentId(Long departmentId);
}
