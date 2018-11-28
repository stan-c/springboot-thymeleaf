package com.demothymeleaf.constants;

/**
 * 返回错误码
 */
public enum ResultStatus {

    /**
     * 处理成功
     */
    SUCCESS(200, "处理成功"),

    /**
     * 处理失败
     */
    FAIL(1001, "处理失败"),

    /**
     * token认证失败
     */
    TOKEN_FAIL(1002, "token认证失败"),

    /**
     * shiro认证失败
     */
    SHIRO_ACCESS_FAIL(1003, "shiro认证失败"),

    /**
     * token认证失败
     */
    NOT_LOGIN_IN(1004, "未登录"),

    /**
     * 业务异常
     */
    BUSINESS_EXCEPTION(1005, "业务异常"),

    /**
     * 用户名已存在
     */
    USER_NAME_REPEAT(1006, "用户名已存在"),

    /**
     * 手机号码已被注册
     */
    PHONE_REPEAT(1007, "手机号码已被注册"),

    /**
     * 验证码错误
     */
    VERIFY_CODE_ERROR(1008, "验证码错误"),

    /**
     * 账户不存在
     */
    USER_NOT_FOUND(1009, "账户不存在"),

    /**
     * 密码错误
     */
    PASSWORD_ERROR(1010, "密码错误"),

    /**
     * 系统错误
     */
    SYSTEM_ERROR(999, "系统错误");

    private ResultStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 根据code返回枚举
     *
     * @param code
     * @return
     */
    public static ResultStatus getResultStatusByCode(int code) {
        for (ResultStatus item : ResultStatus.values()) {
            if (code == item.getCode()) {
                return item;
            }
        }
        return null;
    }
}
