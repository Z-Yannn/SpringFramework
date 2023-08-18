package com.bocloud.spring.postprocessor.g_mergedefinition.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal{

    @Override
    public String toString() {
        return "Cat {person: " + this.getPerson() +
                ", name: " + name +
                '}';
    }

    @Value("mimi")
    private String name;

    public Cat(){
        System.out.println("Cat constructor runs");
    }
}
