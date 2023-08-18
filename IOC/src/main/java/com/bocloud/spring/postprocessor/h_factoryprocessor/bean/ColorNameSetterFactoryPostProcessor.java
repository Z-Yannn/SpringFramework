package com.bocloud.spring.postprocessor.h_factoryprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.stream.Stream;

//@Component
//public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(beanName -> {
//                    BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
//                    if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
//                        if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), this.getClass().getClassLoader())
//                                .getSuperclass().equals(Color.class)) {
//                            beanDefinition.getPropertyValues().add("name", beanName);
//                        }
//                    }
//                }
//            );
//    }
//}
@Component
public class ColorNameSetterFactoryPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Color){
            Color color = (Color) bean;
            color.setName(beanName);
        }
        return bean;
    }
}
