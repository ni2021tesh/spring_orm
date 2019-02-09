package info.niteshjha.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.ThrowsAdvice;

@Slf4j
public class LoggingThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e) {
        log.info("After Throws advice got executed with exception message ::" + e.getMessage());
    }
}
