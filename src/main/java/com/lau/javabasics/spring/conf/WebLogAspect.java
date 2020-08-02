package com.lau.javabasics.spring.conf;

import com.alibaba.fastjson.JSONArray;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WebLogAspect {

    @Around("execution(public * com.lau.javabasics.spring..*.*(..))")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println("请求开始,入参：" + JSONArray.toJSONString(args));

        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
            return proceed;
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("请求结束");
        }

    }

}
