package com.bocloud.spring.basic_di.h_aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean awaredTestBean = ctx.getBean(AwaredTestBean.class);
        awaredTestBean.printBeanNames();

        System.out.println("-------------");
        System.out.println(awaredTestBean.getBeanName());
    }
}
