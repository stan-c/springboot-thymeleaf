package com.demothymeleaf.constants;

public interface Constants {
    /**
     * /分隔符
     */
    final static String SEPARATE_SLASH = "/";

    /**
     * 分号分隔符
     */
    final static String SEPARATE_COLON = ";";

    /**
     * 逗号分隔符
     */
    final static String SEPARATE_COMMA = ",";

    /**
     * 竖线分隔符
     */
    final static String SEPARATE_VERTICAL_LINE = "|";

    final static Integer SUCCESS_CODE = 200;

    final static String SUCCESS_DESC = "处理成功";

    final static Integer FAIL_CODE = 403;

    /**
     * token认证失败返回码
     */
    final static Integer TOKEN_AUTH_FAIL = 9001;

    /**
     * 年月日(yyyy-MM-dd)开始时间默认追加
     */
    String BEGIN_HHMMSS_SEPARATOR_TIME = " 00:00:00";

    /**
     * 年月日(yyyy-MM-dd)结束时间默认追加
     */
    String END_HHMMSS_SEPARATOR_TIME = " 23:59:59";
    /**
     * 年月日(yyyyMMdd)开始时间默认追加
     */
    String BEGIN_HHMMSS_TIME = "000000";

    /**
     * 年月日(yyyyMMdd)结束时间默认追加
     */
    String END_HHMMSS_TIME = "235959";

}
