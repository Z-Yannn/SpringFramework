package com.bocloud.spring.configuration.c_conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;

@Configuration
public class DataSourceConfiguration {
    @Bean
    public DataSource devDataSource(){
        return null;
    }
}
