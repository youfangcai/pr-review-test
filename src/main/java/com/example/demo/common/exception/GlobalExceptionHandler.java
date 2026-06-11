package com.example.demo.common.exception;

import com.example.demo.common.BaseResponse;
import com.example.demo.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 自定义全局异常处理器
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        // 打印日志
        log.error(e.getMessage());
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> businessExceptionHandler(RuntimeException e) {
        // 打印日志
        log.error(e.getMessage());
        return ResultUtils.error(ErrorCode.SERVER_ERROR, e.getMessage());
    }

}
