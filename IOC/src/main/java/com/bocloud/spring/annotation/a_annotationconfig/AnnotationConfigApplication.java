package com.bocloud.spring.annotation.a_annotationconfig;

import com.bocloud.spring.annotation.a_annotationconfig.bean.Cat;
import com.bocloud.spring.annotation.a_annotationconfig.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        Person person = ctx.getBean(Person.class);

        System.out.println(person.getName());

        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat.getMaster().getAge());
//        // 得到所有beans id
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Stream.of(beanNames).forEach(System.out::println);
    }
}
