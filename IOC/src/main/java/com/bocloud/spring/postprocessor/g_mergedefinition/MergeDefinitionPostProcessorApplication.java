package com.bocloud.spring.postprocessor.g_mergedefinition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MergeDefinitionPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.postprocessor.g_mergedefinition");
        ctx.close();
    }
}
