package com.bocloud.spring.lifecycle.e_source.config;

import com.bocloud.spring.lifecycle.e_source.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bocloud.spring.lifecycle.e_source.bean")
public class LifecycleSourceConfiguration {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Person person() {
        Person person = new Person();
        person.setName("lisi");
        return person;
    }
}

