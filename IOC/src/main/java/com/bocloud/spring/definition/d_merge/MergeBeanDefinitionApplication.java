package com.bocloud.spring.definition.d_merge;

import com.bocloud.spring.definition.d_merge.bean.Cat;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeBeanDefinitionApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("definition/merge.xml");
        Cat cat = (Cat) ctx.getBean("cat");
        System.out.println(cat);

        BeanDefinition catDefinition = ctx.getBeanFactory().getMergedBeanDefinition("cat");
        System.out.println(catDefinition);
    }
}
