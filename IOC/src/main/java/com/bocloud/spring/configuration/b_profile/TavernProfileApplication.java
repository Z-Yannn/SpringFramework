package com.bocloud.spring.configuration.b_profile;

import com.bocloud.spring.configuration.b_profile.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernProfileApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 给ApplicationContext的环境设置正在激活的profile
        ctx.getEnvironment().setActiveProfiles("city");
        ctx.register(TavernConfiguration.class);
        ctx.refresh();
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("------------------");
//        ctx.getBeansOfType(Bartender.class).forEach((id, bartenderName)->
//                System.out.println(bartenderName));
    }
}
