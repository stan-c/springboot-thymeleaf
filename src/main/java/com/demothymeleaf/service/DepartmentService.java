package com.demothymeleaf.service;

import com.demothymeleaf.entities.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();

    Department getDepartment(Long id);

    void  saveDepartment(Department department);

    void  updateDepartment(Department department);

    void deleteDeaprtment(Long id);
}
