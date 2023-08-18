package com.bocloud.spring.lifecycle.a_initmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodXmlApplication {
    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/init-destroy.xml");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InitConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");

        System.out.println();

        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
