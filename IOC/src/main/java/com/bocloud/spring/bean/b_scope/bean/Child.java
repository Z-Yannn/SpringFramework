package com.bocloud.spring.bean.b_scope.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Child {
    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }

    private Toy toy;

    public void setToy(Toy toy){
        this.toy = toy;
    }

}
