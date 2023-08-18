package com.bocloud.spring.configuration.c_conditional;

import com.bocloud.spring.configuration.c_conditional.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernProfileApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("------------------");
//        ctx.getBeansOfType(Bartender.class).forEach((id, bartenderName)->
//                System.out.println(bartenderName));
    }
}
