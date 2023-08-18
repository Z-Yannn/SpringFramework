package com.bocloud.spring.environment.a_quickstart;

import com.bocloud.spring.environment.a_quickstart.bean.EnvironmentAwareBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {
    @Bean
    public EnvironmentAwareBean bbb(){
        return new EnvironmentAwareBean();
    }
}
