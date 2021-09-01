package com.zhoushucheng.gulimall.product.exception;

import com.zhoushucheng.common.exception.BizCodeEnume;
import com.zhoushucheng.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ControllerAdvice("com.zhoushucheng.gulimall.product.controller")
@ResponseBody
@Slf4j
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{}，异常类型{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VAILD_EXECEPTION.getCode(), BizCodeEnume.VAILD_EXECEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(Throwable.class)
    public R handleVaildException(Throwable throwable) {
        log.error("未知异常：", throwable);
        return R.error(BizCodeEnume.UNKNOW_EXECEPTION.getCode(), BizCodeEnume.UNKNOW_EXECEPTION.getMsg());
    }

}
