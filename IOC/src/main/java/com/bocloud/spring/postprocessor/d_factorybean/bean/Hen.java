package com.bocloud.spring.postprocessor.d_factorybean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
// 把Hen塞进IOC容器
public class Hen implements FactoryBean<Egg> {
    @Override
    public Egg getObject() throws Exception {
        return new Egg();
    }

    @Override
    public Class<?> getObjectType() {
        return Egg.class;
    }
}
