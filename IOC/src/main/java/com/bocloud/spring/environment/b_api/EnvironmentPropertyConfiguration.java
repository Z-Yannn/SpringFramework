package com.bocloud.spring.environment.b_api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bocloud.spring.environment.b_api.bean")
@PropertySource("classpath:propertysource/jdbc.properties")
public class EnvironmentPropertyConfiguration {
}
