package com.bocloud.spring.lifecycle.b_jsr250.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen {

    private Integer ink;
    @PostConstruct
    public void addInk() {
        System.out.println("钢笔中已加满墨水...");
        this.ink = 100;
    }
    @PreDestroy
    public void outwellInk() {
        System.out.println("钢笔中墨水被放干净了...");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}
