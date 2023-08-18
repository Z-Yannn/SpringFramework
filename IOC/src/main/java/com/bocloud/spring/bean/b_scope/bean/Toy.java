package com.bocloud.spring.bean.b_scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toy {
    public Toy(){
        System.out.println("toy constructor run...");
    }
}
