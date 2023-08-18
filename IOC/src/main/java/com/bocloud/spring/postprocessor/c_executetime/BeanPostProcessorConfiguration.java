package com.bocloud.spring.postprocessor.c_executetime;

import com.bocloud.spring.postprocessor.c_executetime.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bocloud.spring.postprocessor.c_executetime.bean")
public class BeanPostProcessorConfiguration {
    @Bean(initMethod = "initMethod")
    public Dog dog(){
        return new Dog();
    }
}
