package info.niteshjha.spring_aop_annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class LoggingAspect {


    @Before(value = "execution(* info.niteshjha.spring_aop_annotation.BussinessService.*(..))")
    public void logBefore(JoinPoint joinpoint) {
        System.out.println("Before calling " + joinpoint.getSignature().getName());
        log.info("Displaying from LoggingAspect class and logBefore(Pointcut pointcut) method");
    }


    @After(value = "execution(* info.niteshjha.spring_aop_annotation.BussinessService.displayName(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After calling " + joinPoint.getSignature().getName());
        log.info("Displaying from LoggingAspect class and logAfter(Pointcut pointcut) method");
    }

    @AfterThrowing(value = "execution( * info.niteshjha.spring_aop_annotation.BussinessService.throwException(..))", throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Exception error) {
        System.out.println("After throwing the Exception from " + joinPoint.getSignature().getName());
        System.out.println("Exception thrown msg " + error.getMessage());
    }


    @AfterReturning(value = "execution( * info.niteshjha.spring_aop_annotation.BussinessService.getName(..))", returning = "returns")
    public void logAfterReturning(JoinPoint joinPoint, Object returns) {
        System.out.println("After Returning from " + joinPoint.getSignature().getName());
    }

    @Around(value = "execution( * info.niteshjha.spring_aop_annotation.BussinessService.getNames(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Advice " + joinPoint.getSignature().getName());

        System.out.println("Around advice args ::" + Arrays.toString(joinPoint.getArgs()));

        Object proceed = joinPoint.proceed();


        System.out.println("Around Advice " + joinPoint.getSignature().getName());
        return proceed;
    }


}
