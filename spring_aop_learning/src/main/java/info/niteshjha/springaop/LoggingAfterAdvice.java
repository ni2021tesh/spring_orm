package info.niteshjha.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.logging.Logger;

@Slf4j
public class LoggingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        Logger logger = Logger.getLogger(o1.getClass().getName());
        logger.info("After advice got executed with method ::" + method.getName() + " called of class ::" + o1.getClass().getName() + " with args length::" + objects.length);
    }
}
