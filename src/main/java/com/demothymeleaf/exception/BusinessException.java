package com.demothymeleaf.exception;

import com.demothymeleaf.constants.ResultStatus;

/**
 *
 */
public class BusinessException extends RuntimeException {

    public static final long serialVersionUID = 2337937881709830076L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public BusinessException(ResultStatus resultStatus) {
        super(resultStatus.getDesc());
        this.msg = resultStatus.getDesc();
        this.code = resultStatus.getCode();
    }

    public BusinessException(Integer code, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

}
