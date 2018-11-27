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

    @Override
    public List<Department> getDepartments() {
        List<Department> list = departmentMapper.getDepartments();
        return list;
    }

    @Override
    public Department getDepartment(Long id) {
        if(id ==null){
            return null;
        }
        Department department = departmentMapper.getDepartment(id);
        return department;
    }

    @Override
    public void saveDepartment(Department department) {
        if(department.getId() != null){
            throw  new RuntimeException("添加的数据已存在！");
        }
        departmentMapper.saveDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        if(department.getId() == null){
            throw new RuntimeException("获取页面信息失败，请刷新页面重新操作！");
        }
        departmentMapper.updateDepartment(department);
    }

    @Override
    public void deleteDeaprtment(Long id) {
        if(id==null){
            return;
        }
        departmentMapper.deleteDeaprtment(id);
    }


}
