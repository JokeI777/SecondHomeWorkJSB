package Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GetBean {
    public Object getBean(){
        ApplicationContext context =  new AnnotationConfigApplicationContext("Beans");

        var bean = context.getBean("bean");
        return bean;
    }
}
