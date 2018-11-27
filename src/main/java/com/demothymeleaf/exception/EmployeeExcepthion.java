package com.demothymeleaf.exception;



public class EmployeeExcepthion extends  RuntimeException{

    public EmployeeExcepthion() {
        super("用户信息保存失败");
    }
}
