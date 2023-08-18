package com.bocloud.spring.postprocessor.c_executetime.bean;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Dog implements InitializingBean {
    public void initMethod(){
        System.out.println("initMethod...");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct...");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean...");
    }
}
