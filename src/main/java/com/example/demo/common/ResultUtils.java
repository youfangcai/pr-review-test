package com.example.demo.common;


import com.example.demo.common.exception.ErrorCode;

/**
 * ResultUtils 类用于封装 API 的统一响应结果
 */
public class ResultUtils {
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "success");
    }
    public static <T> BaseResponse<T> success() {
        return success(null);
    }
    public static <T> BaseResponse<T> success(String message) {
        return new BaseResponse<>(0, null, message);
    }
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }
}
