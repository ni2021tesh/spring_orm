package info.niteshjha.springaop_xsd;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;

@Slf4j
public class LoggingAspect {
    public void logBefore(JoinPoint joinpoint) {
        System.out.println("Before calling " + joinpoint.getSignature().getName());
        log.info("Displaying from LoggingAspect class and logBefore(Pointcut pointcut) method");
    }


    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After calling " + joinPoint.getSignature().getName());
        log.info("Displaying from LoggingAspect class and logAfter(Pointcut pointcut) method");
    }


    public void logAfterThrowing(JoinPoint joinPoint, Exception error) {
        System.out.println("After throwing the Exception from " + joinPoint.getSignature().getName());
        System.out.println("Exception thrown msg " + error.getMessage());
    }
}
