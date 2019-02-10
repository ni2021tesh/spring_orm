package info.niteshjha.springaop_xsd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOPXSD {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_aop_xsd_learning.xml");
        BussinessServiceImpl bussinessService = applicationContext.getBean("bussinessService", BussinessServiceImpl.class);
        bussinessService.getNames().forEach((s, s2) -> System.out.println("Key is ::" + s + " value is::" + s2));
        bussinessService.displayName();
        try {
            bussinessService.throwException();
        } catch (Exception e) {
        }
    }
}
