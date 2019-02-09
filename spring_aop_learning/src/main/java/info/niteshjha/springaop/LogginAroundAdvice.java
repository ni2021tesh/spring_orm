package info.niteshjha.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogginAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        Logger log = Logger.getLogger(invocation.getMethod().getClass().getName());
        log.info("Before method execution called for ::" + invocation.getMethod().getName());

        Object proceed = null;
        try {
            proceed = invocation.proceed();

        } catch (Exception e) {

            log.log(Level.WARNING, "Error occurred");
        }
        log.info("After method execution called::" + invocation.getMethod().getName());
        return proceed;
    }
}
