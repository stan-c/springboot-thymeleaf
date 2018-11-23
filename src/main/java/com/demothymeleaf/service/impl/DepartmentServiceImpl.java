package com.demothymeleaf.service.impl;

import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public List<Employee> listAll() {
        return null;
    }

    @Override
    public int insert(Employee user) {
        return 0;
    }
}
