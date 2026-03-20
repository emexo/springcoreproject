package com.springcore.annotaion.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect // Indicates that this class is an aspect, which contains advice (code to be executed at certain join points)
@Component
public class LoggingAspect {

    @Before("pointcut()") // Pointcut expression to match the getPassenger method
    public void logBeforeGetPassenger(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("#### Before executing method: {} with arguments: {} ####", methodName, args[0]);
    }

    @Pointcut("execution(* com.springcore.annotaion.aop.PassengerDAO.getPassenger(..))") // Define a reusable pointcut expression
    public void pointcut() {
        // This method is just a placeholder for the pointcut expression and can be left empty
    }
}
