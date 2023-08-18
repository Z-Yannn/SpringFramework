package com.bocloud.spring.configuration.a_module;

import com.bocloud.spring.configuration.a_module.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("------------------");
//        ctx.getBeansOfType(Bartender.class).forEach((id, bartenderName)->
//                System.out.println(bartenderName));
    }
}
