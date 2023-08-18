package com.bocloud.spring.definition.a_quickstart;

import com.bocloud.spring.definition.a_quickstart.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitionQuickstartConfiguration {

    @Bean
    public Person person(){
        return new Person();
    }
}
