package com.demothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController extends BaseController{


    @ResponseBody
    @RequestMapping("/hello")
    public Map<String,Object> index(@RequestParam("name") String name){
        Map<String,Object> map = null;
        if(name.equals("11")){
            return fail("错误代码 1112 ");
        }
        return map;
    }
}
