package com.springcore.dao.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.springcore.dao.UserDAO.findById(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before advice for the method:{} and args:{}", methodName, args[0]);
    }
}
