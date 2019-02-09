package info.niteshjha.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

@Slf4j
public class LogBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        log.info("Before Advice executed for target Object " + o.getClass().getName() + " with argument " + objects.length + " and method name is :" + method.getName());
    }
}
