package com.bocloud.spring.postprocessor.b_getproperty.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CatBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat){
            Cat cat = (Cat) bean;
            System.out.println("before initialization, cat's name is " + cat.getName());
            cat.setName("zhangsan");
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat){
            Cat cat = (Cat) bean;
            System.out.println("After initialization, cat's name is "+ cat.getName());
        }
        return bean;
    }
}
