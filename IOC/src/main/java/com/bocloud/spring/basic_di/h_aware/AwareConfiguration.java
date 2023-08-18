package com.bocloud.spring.basic_di.h_aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwareConfiguration {
    @Bean
    public AwaredTestBean awaredTestBean(){
        return new AwaredTestBean();
    }

}
