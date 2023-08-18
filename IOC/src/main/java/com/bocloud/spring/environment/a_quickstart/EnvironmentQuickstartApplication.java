package com.bocloud.spring.environment.a_quickstart;

import com.bocloud.spring.environment.a_quickstart.bean.EnvironmentAwareBean;
import com.bocloud.spring.environment.a_quickstart.bean.EnvironmentHolder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentQuickstartApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.environment.a_quickstart.bean");
//        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
//        environmentHolder.printEnvironment();
        EnvironmentAwareBean environmentAwareBean = ctx.getBean(EnvironmentAwareBean.class);
        environmentAwareBean.printEnvironmentInfo();
    }
}
