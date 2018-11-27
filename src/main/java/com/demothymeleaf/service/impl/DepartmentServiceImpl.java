package com.demothymeleaf.service.impl;

import com.demothymeleaf.annotation.TargetDataSource;
import com.demothymeleaf.commons.DataSourceKey;
import com.demothymeleaf.dao.DepartmentMapper;
import com.demothymeleaf.entities.Department;
import com.demothymeleaf.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public List<Department> getDepartments() {
        List<Department> list = departmentMapper.getDepartments();
        return list;
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public Department getDepartment(Long id) {
        if(id ==null){
            return null;
        }
        Department department = departmentMapper.getDepartment(id);
        return department;
    }


}
