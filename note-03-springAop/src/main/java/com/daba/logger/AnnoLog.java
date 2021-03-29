package com.daba.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AnnoLog {

    @Around("execution(* com.daba.service.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Before Around");
        Object proceed = jp.proceed();
        System.out.println("After Around. Result: " + proceed);

        return proceed;
    }
}
