package com.bocloud.spring.definition.c_removedefinition.config;


import com.bocloud.spring.definition.c_removedefinition.bean.Person;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;


@Component
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {
    @Override               // ConfigurableListableBeanFactory的唯一实现是DefaultListableBeanFactory DefaultListableBeanFactory的实现是BeanDefinition
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) beanFactory;
        // 获取IOC中所有BeanFactory
        for (String beanDefinitionName: beanFactory.getBeanDefinitionNames()){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            if (Person.class.getName().equals(beanDefinition.getBeanClassName())){ //得到BeanDefinition的路径
                // 判断Person性别是否为male
                TypedStringValue sex = (TypedStringValue) beanDefinition.getPropertyValues().get("sex");
                if ("male".equals(sex.getValue())){
                    beanDefinitionRegistry.removeBeanDefinition(beanDefinitionName);
                }
            }
        }

    }
}
