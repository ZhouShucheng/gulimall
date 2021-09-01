package com.zhoushucheng.common.exception;

public enum BizCodeEnume {
    //调用构造方法
    UNKNOW_EXECEPTION(10000, "系统未知异常"),
    VAILD_EXECEPTION(10001, "参数格式校验失败");

    //成员变量
    private Integer code;
    private String msg;

    //构造方法
    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
