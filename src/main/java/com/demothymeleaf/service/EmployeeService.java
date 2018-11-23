package com.demothymeleaf.service;

import com.demothymeleaf.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listAll();

    int insert(Employee user);
}
