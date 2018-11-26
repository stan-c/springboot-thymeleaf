package com.demothymeleaf.controller;

import com.demothymeleaf.dao.DepartmentMapper;
import com.demothymeleaf.dao.EmployeeMapper;
import com.demothymeleaf.entities.Department;
import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.query.EmployeeQuery;
import com.demothymeleaf.service.DepartmentService;
import com.demothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeDao;
    @Autowired
    DepartmentService departmentDao;

    @GetMapping(value = "/emps")
    public String emplist(Map<String,Object> map){
        Collection<EmployeeQuery> employee = employeeDao.getAll();
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
        employeeDao.saveEmp(employee);
        return  "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public  String toEditPage(@PathVariable("id") Long id , Model model){
        Employee employee = employeeDao.get(id);
        System.out.println("employee:  "+employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        model.addAttribute("emp",employee);
        return "emps/add";
    }

   // 修改员工
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeDao.updateEmp(employee);
        return "redirect:/emps";
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
