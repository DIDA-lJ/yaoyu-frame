package com.qiyao.common;

import com.qiyao.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionAdaptController
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/19
 */
@RestControllerAdvice
public class ExceptionAdaptController {

    @ExceptionHandler({RuntimeException.class})
    public Result runTimeException(RuntimeException exception) {
        exception.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler({Exception.class})
    public Result exception(Exception exception){
        exception.printStackTrace();
        return Result.fail();
    }
}
