package com.bocloud.spring.configuration.c_conditional.config;

import com.bocloud.spring.configuration.c_conditional.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
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

