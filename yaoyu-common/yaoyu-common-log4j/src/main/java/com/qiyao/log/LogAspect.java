package com.qiyao.log;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @ClassName LogAspect
 * @Description 日志切面
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/04
 */
@Aspect
@Component
@Slf4j
@ConditionalOnProperty(name = "{log.aspect.enabled}", havingValue = "true", matchIfMissing = true)
public class LogAspect {
    /**
     * 日志切入点
     */
    @Pointcut("execution(* com.qiyao.*.controller.*Controller.*(..)) || execution(* com.qiyao.*.service.*Service.*(..))")
    private void pointCut() {
    }

    @Around(("pointCut()"))
    private void around(ProceedingJoinPoint pjp) {
        // 获取到参数数组
        Object[] reqArgs = pjp.getArgs();
        String req = new Gson().toJson(reqArgs);
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
    }
}
