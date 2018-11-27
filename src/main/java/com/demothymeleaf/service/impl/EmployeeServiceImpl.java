package com.demothymeleaf.service.impl;

import com.demothymeleaf.annotation.TargetDataSource;
import com.demothymeleaf.commons.DataSourceKey;
import com.demothymeleaf.dao.EmployeeMapper;
import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.query.EmployeeQuery;
import com.demothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public void saveEmp(Employee employee) {
        employeeMapper.saveEmp(employee);
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public List<EmployeeQuery> getAll() {
        List<EmployeeQuery> list = employeeMapper.getAll();
        if(list.size()<0){
            return null;
        }
        return list;
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public Employee get(Long id) {
        Employee emp = employeeMapper.get(id);
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return emp;
    }


    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }


    @Override
    public void updateEmp(Employee employee) {
        if(employee.getId() == null){
            return ;
        }
        employeeMapper.updateEmp(employee);
    }
}
