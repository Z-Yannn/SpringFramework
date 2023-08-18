package com.bocloud.spring.postprocessor.e_beforeinstantiation.config;

import com.bocloud.spring.postprocessor.e_beforeinstantiation.bean.Ball;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class BallFactoryInstantiationProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("ball".equals(beanName)){
//        if (Ball.class.equals(beanClass)){
            // 返回非null 代表拦截创建
            Ball ball = new Ball();
            ball.setId("工厂球");
            return ball;
        }
        // 默认返回null 不拦截
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("ball2".equals(beanName)){
            // 由于 PropertyValues 设计为接口且只暴露可读方法，此处选用实现类重新包装并添加 id 属性
            MutablePropertyValues values = new MutablePropertyValues(pvs);
            values.addPropertyValue("id","拦截球");
            return values;
        }
        return null;
    }
}
