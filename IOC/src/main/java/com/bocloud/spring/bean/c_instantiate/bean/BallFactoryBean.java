package com.bocloud.spring.bean.c_instantiate.bean;

import org.springframework.beans.factory.FactoryBean;

public class BallFactoryBean implements FactoryBean<Ball> {
    @Override
    public Ball getObject() throws Exception {
        return new Ball();
    }

    @Override
    public Class<Ball> getObjectType() {
        return Ball.class;
    }
}
