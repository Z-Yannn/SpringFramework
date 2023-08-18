package com.bocloud.spring.definition.a_quickstart;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionQuickstartXmlApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("definition/quick-start.xml");
        BeanDefinition beanDefinition = ctx.getBeanFactory().getBeanDefinition("person");
        System.out.println(beanDefinition.getBeanClassName());
    }
}
