package com.bocloud.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Green {

    @Value("#{'copy of ' + blue.name}")
    private String name;
    @Value("#{blue.order + 1}")
    private Integer order;

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Green{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
