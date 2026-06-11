package com.example.demo.common;

import com.example.demo.common.exception.ErrorCode;
import lombok.Getter;

/**
 * 自定义基础响应类
 * @param <T>
 */
@Getter
public class BaseResponse<T> {
    private int code;
    private T data;
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
    public BaseResponse(int code, T data) {
        this(code, data, "");
    }
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}
