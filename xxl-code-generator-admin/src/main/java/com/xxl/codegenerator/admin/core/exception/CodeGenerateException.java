package com.xxl.codegenerator.admin.core.exception;

/**
 * @Author: miaohq
 * @Date: 2018-12-26 10:05:29
 * @Version 1.0
 */
public class CodeGenerateException extends RuntimeException {
    private static final long serialVersionUID = 42L;

    public CodeGenerateException(String msg) {
        super(msg);
    }

    public CodeGenerateException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CodeGenerateException(Throwable cause) {
        super(cause);
    }

}
