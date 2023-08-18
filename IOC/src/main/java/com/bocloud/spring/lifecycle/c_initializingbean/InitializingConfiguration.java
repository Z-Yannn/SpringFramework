package com.bocloud.spring.lifecycle.c_initializingbean;

import com.bocloud.spring.lifecycle.c_initializingbean.bean.Pen3;
import org.springframework.context.annotation.Bean;

public class InitializingConfiguration {
    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen3 pen(){
        return new Pen3();
    }
}
