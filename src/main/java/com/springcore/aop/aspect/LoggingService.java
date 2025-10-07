package com.springcore.aop.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect
@Component
public class LoggingService {

    //@Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        log.info("Before method: " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            log.info("Argument: " + arg);
        }

    }

    //@Pointcut("execution(public Passenger com.springcore.aop.dao.PassengerDAOImpl.*(Integer, ..))")
    //@Pointcut("within(com.springcore.aop.dao..*)")
    //@Pointcut("bean(*DAOImpl && get*)")
    public void pointcut(){

    }

    //@After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint){
        log.info("After method: " + joinPoint.getSignature().getName());
    }

    //@Around("pointcut()")
    public Object  aroundAdvice(ProceedingJoinPoint joinPoint){
        log.info("Around method: " + joinPoint.getSignature().getName());
        Object obj = null;
        try {
            obj = joinPoint.proceed();
            log.info("Around after proceed method: " + joinPoint.getSignature().getName());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        return  obj;
    }

    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void  afterReturningAdvice(JoinPoint joinPoint, Object result){
        log.info("After returning method: " + joinPoint.getSignature().getName());
        log.info("Result: " + result);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception){
        log.info("After throwing method: " + joinPoint.getSignature().getName());
        log.info("Exception: " + exception.getMessage());
    }
}
