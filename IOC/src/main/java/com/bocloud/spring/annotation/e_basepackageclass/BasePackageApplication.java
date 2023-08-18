package com.bocloud.spring.annotation.e_basepackageclass;

import com.bocloud.spring.annotation.e_basepackageclass.config.BasePackageClassConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class BasePackageApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BasePackageClassConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
