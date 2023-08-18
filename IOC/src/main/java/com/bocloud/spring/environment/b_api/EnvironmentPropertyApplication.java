package com.bocloud.spring.environment.b_api;

import com.bocloud.spring.environment.b_api.bean.EnvironmentHolder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentPropertyApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnvironmentPropertyConfiguration.class);
        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}
