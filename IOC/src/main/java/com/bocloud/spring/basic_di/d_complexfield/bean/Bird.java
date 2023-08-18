package com.bocloud.spring.basic_di.d_complexfield.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Bird {
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }

    private String name;

    @Resource(name="master")
    private Person person;

}
