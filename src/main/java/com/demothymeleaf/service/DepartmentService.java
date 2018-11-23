package com.demothymeleaf.service;

import com.demothymeleaf.entities.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> listAll();

    int insert(Department user);
}
