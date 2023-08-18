package com.bocloud.spring.postprocessor.f_destruction.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DestructionPenPostProcessor implements DestructionAwareBeanPostProcessor {
    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof Pen){
            System.out.println("DestructionPenPostProcessor postProcessBeforeDestruction is running");
            Pen pen = (Pen) bean;
            pen.setInk(0);
        }
    }
}
