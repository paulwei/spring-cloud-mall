package com.whl.oauth2.api;

/**
 * 封装API的错误码
 * 
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
