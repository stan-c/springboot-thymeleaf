package com.demothymeleaf.controller;

import com.demothymeleaf.exception.EmployeeExcepthion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name){
        if(name.equals("11")){
            throw  new EmployeeExcepthion();
        }
        return "Hello World";
    }
}
