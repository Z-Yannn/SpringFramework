package com.bocloud.spring.definition.a_quickstart;

import com.bocloud.spring.definition.a_quickstart.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.transform.Source;
import java.util.stream.Stream;

public class BeanDefinitionQuickstartComponentApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.definition.a_quickstart.bean");
        BeanDefinition beanDefinition = ctx.getBeanDefinition("person");
//        System.out.println(beanDefinition.getClass().getName());
//        Person person  = (Person) ctx.getBean("person");
//        System.out.println(person);
        System.out.println(beanDefinition.getBeanClassName());
//        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
