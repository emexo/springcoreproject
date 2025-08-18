package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Log4j2
@Component
@Aspect
public class LoggerService {

    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before executing method: " + methodName);
        if (args != null && args.length > 0) {
            log.info("With arguments: ");
            for (Object arg : args) {
                log.info(arg);
            }
        } else {
            log.info("No arguments passed.");
        }
        log.info("Logging before method execution completed.");
    }

    @After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        log.info("After executing method: " + methodName);
        log.info("Logging after method execution completed.");
    }

    //@Pointcut("execution(* com.springcore.dao.UserDAOImpl.getUserById(..))") // Define a pointcut for methods in UserDAOImpl
   // @Pointcut("execution(* com.springcore.dao.UserDAOImpl.*(..))") //    This pointcut matches all methods in UserDAOImpl
   // @Pointcut("execution(* UserDAOImpl.*(..))") // This pointcut matches all methods in UserDAOImpl
    //@Pointcut("execution(public * com.springcore.dao.UserDAOImpl.*(..))") // This pointcut matches all public methods in UserDAOImpl
    //@Pointcut("execution(public User com.springcore.dao.UserDAOImpl.*(..))") //
   //@Pointcut("within(com.springcore.dao.*)") // This pointcut matches all methods within the com.springcore.dao package
   // @Pointcut("within(com.springcore.dao..*)")  // This pointcut matches all methods within the com.springcore.dao package and its sub-packages
   // @Pointcut("bean(*DAOImpl)") // // This pointcut matches all beans whose names end with "DAOImpl"
   @Pointcut("bean(*DAOImpl && *Service)") // // This pointcut matches all beans whose names end with "DAOImpl" and "Service"
    public void pointcut() {
        // This method is intentionally left empty.
        // It serves as a placeholder for pointcut definitions if needed in the future.
    }

    @AfterReturning(pointcut = "pointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        log.info("After returning from method: " + methodName);
        log.info("Result: " + result);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        String methodName = joinPoint.getSignature().getName();
        log.error("Exception thrown in method: " + methodName);
        log.error("Exception message: " + exception.getMessage());
        log.error("Stack trace: ", exception);
    }

    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        log.info("Around advice before executing method: " + methodName);

        Object result;
        try {
            result = proceedingJoinPoint.proceed();
            log.info("Around advice after executing method: " + methodName);
        } catch (Throwable throwable) {
            log.error("Exception in around advice for method: " + methodName, throwable);
            throw throwable; // rethrow the exception
        }

        log.info("Result from around advice: " + result);
        return result;
    }
}
