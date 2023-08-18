package com.bocloud.spring.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pen2 {
    private Integer ink;

    public void open() {
        System.out.println("init-method - 打开钢笔。。。");
    }

    public void close() {
        System.out.println("destroy-method - 合上钢笔。。。");
    }

    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct - 钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy - 钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

}
