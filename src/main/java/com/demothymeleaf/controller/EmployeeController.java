package com.demothymeleaf.controller;

import com.demothymeleaf.dao.DepartmentDao;
import com.demothymeleaf.dao.EmployeeDao;
import com.demothymeleaf.entities.Department;
import com.demothymeleaf.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @GetMapping(value = "/emps")
    public String emplist(Map<String,Object> map){
        Collection<Employee> employee = employeeDao.getAll();
        map.put("emps",employee);
        return "emps/list";
    }

    @GetMapping(value = "/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emps/add";
    }

    @PostMapping(value = "/emp")
    public String addPage(Employee employee){
        System.out.println("--: "+employee.toString());
        employeeDao.save(employee);
        return  "redirect:/emps";
    }

}
