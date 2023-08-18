package com.bocloud.spring.lifecycle.e_source;

import com.bocloud.spring.lifecycle.e_source.config.LifecycleDestructionPostProcessor;
import com.bocloud.spring.lifecycle.e_source.config.LifecycleNameReadPostProcessor;
import com.bocloud.spring.lifecycle.e_source.config.LifecycleSourceConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleSourceAnnotationApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(LifecycleSourceConfiguration.class);
        ctx.register(LifecycleNameReadPostProcessor.class);
        ctx.register(LifecycleDestructionPostProcessor.class);

        // 与上面一致，不再重复贴出
    }
}
