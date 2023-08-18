package com.bocloud.spring.lifecycle.a_initmethod;

import com.bocloud.spring.lifecycle.a_initmethod.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("wangwang");
        return dog;
    }
}
