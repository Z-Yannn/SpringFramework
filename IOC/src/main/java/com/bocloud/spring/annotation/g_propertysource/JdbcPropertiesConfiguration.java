package com.bocloud.spring.annotation.g_propertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bocloud.spring.annotation.g_propertysource.bean")
@PropertySource("classpath:propertysource/jdbc.properties")
public class JdbcPropertiesConfiguration {

}
