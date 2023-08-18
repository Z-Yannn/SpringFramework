package com.bocloud.spring.bean.a_type;

import com.bocloud.spring.bean.a_type.bean.Ball;
import com.bocloud.spring.bean.a_type.bean.Child;
import com.bocloud.spring.bean.a_type.bean.Toy;
import com.bocloud.spring.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bocloud.spring.bean.a_type.bean")
public class ToyFactoryConfiguration {

    @Bean
    public Child child(){
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean(){
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }

//    @Bean
//    public Toy ball(){
//        return new Ball("ball");
//    }



}
