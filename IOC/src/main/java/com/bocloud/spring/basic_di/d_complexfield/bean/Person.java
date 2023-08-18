package com.bocloud.spring.basic_di.d_complexfield.bean;

import org.springframework.stereotype.Component;

@Component("administrator")
public class Person {
    private String name = "administrator";
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
