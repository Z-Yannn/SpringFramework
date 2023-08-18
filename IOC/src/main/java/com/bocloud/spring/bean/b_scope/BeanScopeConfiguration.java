package com.bocloud.spring.bean.b_scope;

import com.bocloud.spring.bean.b_scope.bean.Child;
import com.bocloud.spring.bean.b_scope.bean.Toy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bocloud.spring.bean.b_scope.bean")
public class BeanScopeConfiguration {
    @Bean
    public Child child1(Toy toy){
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy){
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

}
