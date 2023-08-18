package com.bocloud.spring.bean.a_type.bean;

import org.springframework.stereotype.Component;

@Component
public class Child {
    private String wantToy = "ball";
    public String getWantToy(){
        return wantToy;
    }
}
