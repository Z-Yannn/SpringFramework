package com.bocloud.spring.postprocessor.f_destruction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DestructionPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.postprocessor.f_destruction");
        ctx.close();
    }
}
