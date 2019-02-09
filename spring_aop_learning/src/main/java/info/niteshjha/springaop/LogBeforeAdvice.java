package info.niteshjha.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.logging.Logger;

@Slf4j
public class LogBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        Logger logger = Logger.getLogger(o.getClass().getName());
        logger.info("Before Advice executed for target Object " + o.getClass().getSimpleName() + " with argument " + objects.length + " and method name is :" + method.getName());
    }
}
