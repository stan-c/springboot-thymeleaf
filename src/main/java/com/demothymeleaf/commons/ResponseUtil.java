package com.demothymeleaf.commons;

import com.alibaba.fastjson.JSON;
import com.demothymeleaf.constants.ResultStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;


public class ResponseUtil {
    private static final Logger logger = LoggerFactory.getLogger(ResponseUtil.class);

    /**
     * 返回给前台JSON
     *
     * @param response
     * @param status
     */
    public static void constructResponse(ServletResponse response, ResultStatus status) {
        try {
            response.setContentType("application/json;charset=UTF-8");
            Writer out = response.getWriter();
            HashMap<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("msg", status.getDesc());
            modelMap.put("code", status.getCode());
            out.write(JSON.toJSONString(modelMap));
            out.flush();
            out.close();
        } catch (IOException e) {
            logger.error("construct Response error", e);
        }
    }

    public static void constructResponse(ServletResponse response, int code,String msg) {
        try {
            response.setContentType("application/json;charset=UTF-8");
            Writer out = response.getWriter();
            HashMap<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("msg", msg);
            modelMap.put("code", code);
            out.write(JSON.toJSONString(modelMap));
            out.flush();
            out.close();
        } catch (IOException e) {
            logger.error("construct Response error", e);
        }
    }

    /**
     * token认证失败
     * @param response
     */
    public static void tokenError(ServletResponse response) {
        constructResponse(response, ResultStatus.TOKEN_FAIL);
    };
}
