package com.bocloud.spring.basic_di.c_value_spel;

import com.bocloud.spring.basic_di.c_value_spel.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
//        Black black = ctx.getBean(Black.class);
//        System.out.println("simple value: " + black);
//        Red red = ctx.getBean(Red.class);
//        System.out.println(red);
//        Blue blue = ctx.getBean(Blue.class);
//        System.out.println(blue);
//        Green green = ctx.getBean(Green.class);
//        System.out.println(green);
        White white = ctx.getBean(White.class);
        System.out.println(white);
    }
}
