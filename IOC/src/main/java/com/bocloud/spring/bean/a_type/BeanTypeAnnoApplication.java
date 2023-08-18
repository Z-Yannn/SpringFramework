package com.bocloud.spring.bean.a_type;

import com.bocloud.spring.bean.a_type.bean.Toy;
import com.bocloud.spring.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

public class BeanTypeAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ToyFactoryConfiguration.class);
//        Toy toy = ctx.getBean(Toy.class);
//        Toy toy2 = ctx.getBean(Toy.class);
//        System.out.println(toy == toy2);
//        System.out.println(ctx.getBean(ToyFactoryBean.class));
//        System.out.println(toy);
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy);
        });


    }
}
