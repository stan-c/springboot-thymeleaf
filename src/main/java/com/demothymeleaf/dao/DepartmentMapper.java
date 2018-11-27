package com.demothymeleaf.dao;

import com.demothymeleaf.entities.Department;

import java.util.Collection;
import java.util.List;

public interface DepartmentMapper {

      List<Department> getDepartments();

      Department getDepartment(Long id);

      void  saveDepartment(Department department);

      void  updateDepartment(Department department);

      void deleteDeaprtment(Long id);
}
