package com.bocloud.spring.definition.c_removedefinition;

import com.bocloud.spring.definition.c_removedefinition.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoveBeanDefinitionApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("definition/remove-registry.xml");
        Person aqiang = (Person) ctx.getBean("aqiang");
        System.out.println(aqiang);
    }
}
