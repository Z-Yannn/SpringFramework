package com.bocloud.spring.event.b_registerevent;

import com.bocloud.spring.event.b_registerevent.Service.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.event.b_registerevent");
        RegisterService registerService = ctx.getBean(RegisterService.class);
        registerService.register("张三");
    }
}
