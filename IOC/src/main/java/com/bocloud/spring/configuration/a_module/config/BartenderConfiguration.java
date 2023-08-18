package com.bocloud.spring.configuration.a_module.config;

import com.bocloud.spring.configuration.a_module.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {
    @Bean
    public Bartender zhangxiaosan(){
        return new Bartender("zhangxiaosan");
    }

    @Bean
    public Bartender zhangdasan(){
        return new Bartender("zhangdasan");
    }
}

