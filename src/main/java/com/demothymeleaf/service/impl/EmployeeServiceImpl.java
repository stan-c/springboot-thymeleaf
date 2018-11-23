package com.demothymeleaf.service.impl;

import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<Employee> listAll() {


        return null;
    }

    @Override
    public int insert(Employee user) {
        return 0;
    }
}
