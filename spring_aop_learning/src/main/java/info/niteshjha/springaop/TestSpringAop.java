package info.niteshjha.springaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-aop-learning.xml");
        BussinessDao bean = classPathXmlApplicationContext.getBean(BussinessDao.class);
        bean.display();
        try {
            bean.throwException();
        } catch (Exception e) {
        }
    }
}
