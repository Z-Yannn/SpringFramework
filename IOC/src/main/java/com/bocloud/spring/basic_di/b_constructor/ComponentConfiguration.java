package com.bocloud.spring.basic_di.b_constructor;

import com.bocloud.spring.basic_di.b_constructor.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfiguration {
    //注解式构造器属性注入
    @Bean
    public Person person(){
        return new Person("ryan",18);
    }
}
