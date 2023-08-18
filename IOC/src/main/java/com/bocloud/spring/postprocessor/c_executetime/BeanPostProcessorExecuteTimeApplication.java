package com.bocloud.spring.postprocessor.c_executetime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorExecuteTimeApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
        ctx.close();
    }
}
