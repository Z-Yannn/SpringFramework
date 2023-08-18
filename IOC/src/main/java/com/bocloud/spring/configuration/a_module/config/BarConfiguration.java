package com.bocloud.spring.configuration.a_module.config;

import com.bocloud.spring.configuration.a_module.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//
@Configuration
public class BarConfiguration {
    @Bean
    public Bar niceBar(){
        return new Bar();
    }
}
