package info.niteshjha.spring_aop_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAopAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_aop_annotation.xml");

        BussinessServiceImpl bean = applicationContext.getBean("bussinessService", BussinessServiceImpl.class);
        bean.getNames();
        System.out.println("***********************************************************************************");
        bean.displayName();
        System.out.println("***********************************************************************************");
        bean.getName("ID_2");
        System.out.println("***********************************************************************************");
        bean.throwException();
    }
}
