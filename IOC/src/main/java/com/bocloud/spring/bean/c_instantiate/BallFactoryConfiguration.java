package com.bocloud.spring.bean.c_instantiate;

import com.bocloud.spring.bean.c_instantiate.bean.BallFactoryBean;
import org.springframework.context.annotation.Bean;

public class BallFactoryConfiguration {
    @Bean
    public BallFactoryBean ballFactoryBean() {
        return new BallFactoryBean();
    }

}
