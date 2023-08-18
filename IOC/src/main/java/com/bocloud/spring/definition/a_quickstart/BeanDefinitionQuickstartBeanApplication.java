package com.bocloud.spring.definition.a_quickstart;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionQuickstartBeanApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanDefinitionQuickstartConfiguration.class);
        BeanDefinition beanDefinition = ctx.getBeanDefinition("person");
        System.out.println(beanDefinition);
        System.out.println(beanDefinition.getClass().getName());
    }
}
