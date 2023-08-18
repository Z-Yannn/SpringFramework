package com.bocloud.spring.postprocessor.h_factoryprocessor;

import com.bocloud.spring.postprocessor.h_factoryprocessor.bean.Red;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 在 bean 还没有创建之前，把 bean 的名称设置到 bean 的属性
public class FactoryProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.bocloud.spring.postprocessor.h_factoryprocessor");
        Red red = ctx.getBean(Red.class);
        System.out.println(red);
    }
}
