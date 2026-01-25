package com.springcoreproject.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging method execution in PassengerDAO implementations.
 */
@Component
@Aspect
@Log4j2
public class LoggingAspect {

    @Before("pointcutExample()")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String passportNumber = joinPoint.getArgs()[0].toString();
        log.info("Executing method:{} with passport number:{} " , methodName,  passportNumber);
    }

    @After("pointcutExample()")
    public void afterAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        log.info("Method:{} execution completed." , methodName);
    }

    @Pointcut("execution(* com.springcoreproject.aop.PassengerDAO.*(..))")
    public void pointcutExample(){

    }

    @AfterReturning(pointcut = "pointcutExample()", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        log.info("Method:{} returned value: {}" , methodName, result);
    }

    @AfterThrowing(pointcut = "pointcutExample()", throwing = "error")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable error){
        String methodName = joinPoint.getSignature().getName();
        log.error("Method:{} threw exception: {}" , methodName, error);
    }
}
