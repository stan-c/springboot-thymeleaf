package com.demothymeleaf.controller;

import com.demothymeleaf.entities.Department;
import com.demothymeleaf.entities.Employee;
import com.demothymeleaf.service.DepartmentService;
import com.demothymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/depts")
    public String emplist(Map<String ,Object> map){
        List<Department> list = departmentService.getDepartments();
        map.put("depts",list);
        return "depts/list";
    }

    // 跳转部门信息保存页面
    @GetMapping(value = "/dept")
    public String toAddPage(){
        return "depts/add";
    }

    @PostMapping(value = "/dept")
    public  String savePage(Department department){
        departmentService.saveDepartment(department);
        return "redirect:/depts";
    }

    @GetMapping(value = "/dept/{id}")
    public String toEditPage(@PathVariable("id") Long id,Model model){
        Department department = departmentService.getDepartment(id);
        model.addAttribute("dept",department);
        return "depts/add";
    }

    @PutMapping(value = "/dept")
    public String updateDepartment(Department department){
        departmentService.updateDepartment(department);
        return "redirect:/depts";
    }

    @DeleteMapping(value ="/dept/{id}")
    public String deleteDepartment(@PathVariable("id") Long id,Model model){
        departmentService.deleteDeaprtment(id);
        return "redirect:/depts";
    }
}
