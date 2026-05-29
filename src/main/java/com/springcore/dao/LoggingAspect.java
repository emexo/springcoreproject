package com.springcore.dao;

import com.springcore.annotaion.scope.Employee;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.Executors;

@Component
@Aspect
@Log4j2
public class LoggingAspect {

    @Before("execution(* com.springcore.dao.UserDAOImpl.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        log.info("Before advice, method name:{} and args:{}", joinPoint.getSignature().getName(), joinPoint.getArgs());
    }

    @After("execution(* com.springcore.dao.UserDAOImpl.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        log.info("After advice, method name:{}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.springcore.dao.UserDAOImpl.*(..))" , returning = "object")
    public void afterReturning(JoinPoint joinPoint, Object object){
        log.info("After returning method name:{} and args:{}", joinPoint.getSignature().getName(),
                object);
    }

    @AfterThrowing(pointcut = "execution(* com.springcore.dao.UserDAOImpl.*(..))" , throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        log.info("After throwing the exception:{}", exception);
    }

    @Around("execution(* com.springcore.dao.UserDAOImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Around advice, method name:{} and args:{}", proceedingJoinPoint.getSignature().getName(), proceedingJoinPoint.getArgs());
        Object obj = proceedingJoinPoint.proceed();
        log.info("Around execute the method response:{}", obj);
    }
}
