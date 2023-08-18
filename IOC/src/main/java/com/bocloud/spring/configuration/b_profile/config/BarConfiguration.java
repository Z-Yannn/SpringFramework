package com.bocloud.spring.configuration.b_profile.config;

import com.bocloud.spring.configuration.b_profile.component.Bar;
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
