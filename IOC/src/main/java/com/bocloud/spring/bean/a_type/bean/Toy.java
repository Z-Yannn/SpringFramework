package com.bocloud.spring.bean.a_type.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Component
public abstract class Toy {
    private String name;
    public Toy(String name){
        System.out.println("生产了一个" + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }

}
