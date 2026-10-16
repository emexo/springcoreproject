package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Aspect
public class LoggingAspect {

    //@Before("execution(* com.springcore.dao.StationDAO.findById(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("**** Before advice for the method:{} and args:{}", methodName, args[0]);
    }

    //@After("execution(* com.springcore.dao.StationDAO.findById(..))")
    public void afterAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("#### After advice for the method:{} and args:{}", methodName, args[0]);
    }
    //@AfterReturning(pointcut = "execution(* com.springcore.dao.StationDAO.findById(..))", returning = "obj")
    public void afterReturning(JoinPoint joinPoint, Object obj){
        String methodName = joinPoint.getSignature().getName();
        log.info("After returning method name:{} with return value:{}", methodName, obj);
    }

   // @AfterThrowing(pointcut = "execution(* com.springcore.dao.StationDAO.findById(..))", throwing = "exp")
    public void afterThrowing(JoinPoint joinPoint, Exception exp){
        String methodName = joinPoint.getSignature().getName();
        log.info("After throwing method name:{} with exception:{}", methodName, exp);
    }

    @Around("execution(* com.springcore.dao.StationDAO.findById(..))")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        log.info("**** Around before advice for the method:{} and args:{}", methodName, args[0]);

       Object obj = proceedingJoinPoint.proceed();
       log.info("Around after advice with response:{}", obj);
       return obj;
    }
}
