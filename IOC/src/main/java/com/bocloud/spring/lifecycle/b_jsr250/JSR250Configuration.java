package com.bocloud.spring.lifecycle.b_jsr250;

import com.bocloud.spring.lifecycle.b_jsr250.bean.Pen2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSR250Configuration {
    @Bean(initMethod = "open",destroyMethod = "close")
    public Pen2 pen(){
        return new Pen2();
    }
}
