package com.springcoreproject.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging method execution in PassengerDAO implementations.
 */
@Component
@Aspect
@Log4j2
public class LoggingAspect {

    @Before("execution(* com.springcoreproject.aop.PassengerDAO.getPassengerByPassportNumber(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String passportNumber = joinPoint.getArgs()[0].toString();
        log.info("Executing method:{} with passport number:{} " , methodName,  passportNumber);
    }
}
