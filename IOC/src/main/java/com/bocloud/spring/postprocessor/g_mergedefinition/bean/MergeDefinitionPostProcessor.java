package com.bocloud.spring.postprocessor.g_mergedefinition.bean;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MergeDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        if (Cat.class.equals(beanType)){
            System.out.println("MergeDefinitionPostProcessor postProcessMergedBeanDefinition");
            System.out.println(beanDefinition);
        }
    }
}
