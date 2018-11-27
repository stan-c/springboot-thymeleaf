package com.demothymeleaf.dao;

import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.query.EmployeeQuery;

import java.util.List;

public interface EmployeeMapper {

     void saveEmp(Employee employee);

     List<EmployeeQuery> getAll();

     Employee get(Long id);

     void delete(Long id);

     void updateEmp(Employee e);

     Employee getDepartmentId(Long departmentId);

}
