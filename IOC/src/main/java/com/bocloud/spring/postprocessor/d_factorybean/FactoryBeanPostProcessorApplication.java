package com.bocloud.spring.postprocessor.d_factorybean;

import com.bocloud.spring.postprocessor.d_factorybean.bean.Egg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class FactoryBeanPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.postprocessor.d_factorybean");
        Egg egg = ctx.getBean(Egg.class);
        System.out.println(egg);

    }
}
