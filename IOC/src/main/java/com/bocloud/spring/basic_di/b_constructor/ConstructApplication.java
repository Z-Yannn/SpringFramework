package com.bocloud.spring.basic_di.b_constructor;

import com.bocloud.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.getAge());
    }
}
