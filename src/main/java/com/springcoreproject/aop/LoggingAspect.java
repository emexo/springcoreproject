package com.springcoreproject.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging method execution in PassengerDAO implementations.
 */
@Component
@Order(1)
@Aspect
@Log4j2
public class LoggingAspect {

    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before method: " + methodName + ", with arguments: " + args[0]);
    }

    @Pointcut("execution(* com.springcoreproject.aop.PassengerDAO.*(..))")
    public void pointcut(){}

    @After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        log.info("After method: " + methodName);
    }


}
