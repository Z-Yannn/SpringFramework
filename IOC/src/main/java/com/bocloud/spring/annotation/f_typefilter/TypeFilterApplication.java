package com.bocloud.spring.annotation.f_typefilter;

import com.bocloud.spring.annotation.f_typefilter.config.TypeFilterConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

public class TypeFilterApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TypeFilterConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
