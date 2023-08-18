package com.bocloud.spring.basic_di.c_value_spel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bocloud.spring.basic_di.c_value_spel.bean")
@PropertySource("classpath:basic_di/red.properties")
public class InjectValueConfiguration {
}
