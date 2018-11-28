package com.demothymeleaf.controller;

import com.demothymeleaf.commons.ResponseUtil;
import com.demothymeleaf.constants.ResultStatus;
import com.demothymeleaf.exception.BusinessException;
import com.github.pagehelper.Page;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
    protected static final String UTF8 = "UTF-8";

    public BaseController() {
    }

    protected <T> Map<String, Object> success(T data) {
        HashMap<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("data", data);
        modelMap.put("msg", ResultStatus.SUCCESS.getDesc());
        modelMap.put("code", ResultStatus.SUCCESS.getCode());
        return modelMap;
    }

    protected <T> Map<String, Object> success() {
        return success(null);
    }


    protected <T> Map<String, Object> successD(Object object) {
        return success(object);
    }

    protected Map<String, Object> fail() {
        HashMap<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("msg", ResultStatus.FAIL.getDesc());
        modelMap.put("code", ResultStatus.FAIL.getCode());
        return modelMap;
    }

    protected Map<String, Object> fail(String message) {
        HashMap<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("msg", message);
        modelMap.put("code", ResultStatus.FAIL.getCode());
        return modelMap;
    }

    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    protected Map<String, Object> page(Page<?> dataPage) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (null == dataPage) {
            return modelMap;
        }
        modelMap.put("code", 200);
        modelMap.put("total", Integer.valueOf(String.valueOf(dataPage.getTotal())));
        modelMap.put("currentPage", dataPage.getPageNum());
        modelMap.put("datas", dataPage.getResult() != null ? dataPage.getResult() : new ArrayList<Object>(1));
        return modelMap;
    }

    @ExceptionHandler
    @ResponseBody
    public void handlerException(HttpServletRequest request, HttpServletResponse response, Throwable ex) {
        if (ex instanceof BusinessException) {
            BusinessException crex = (BusinessException) ex;
            String msg = crex.getMsg();
            if (StringUtils.isEmpty(msg)) {
                ResponseUtil.constructResponse(response, ResultStatus.getResultStatusByCode(crex.getCode()));
            } else {
                ResponseUtil.constructResponse(response, crex.getCode(), crex.getMessage());
            }
        } else {
            logger.error("应用服务器异常，请联系系统管理员！", ex);
            ResponseUtil.constructResponse(response, ResultStatus.getResultStatusByCode(500));
        }
    }

}
