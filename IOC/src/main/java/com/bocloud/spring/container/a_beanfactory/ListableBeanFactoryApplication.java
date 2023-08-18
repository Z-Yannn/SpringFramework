package com.bocloud.spring.container.a_beanfactory;


import com.bocloud.spring.container.a_beanfactory.bean.Dog;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;
import java.util.stream.Stream;

public class ListableBeanFactoryApplication {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("container/listable-container.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        // 加载xml文件后容器中的bean
        System.out.println("加载xml文件后容器中的bean: ");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println();

        beanFactory.registerSingleton("doggg", new Dog());
        System.out.println("手动注册单实例bean后容器所有bean: ");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        // [Output]:
        // com.bocloud.spring.container.a_beanfactory.bean.Cat#0
        // ListableBeanFactory 在获取容器内所有 Bean 时真的不会把这些手动注册的拿出来，也就是文档注释中说的 “忽略通过其他方式”

        System.out.println("容器是否注册dog: " + beanFactory.getBean("doggg"));
        System.out.println("查找所用dog type bean: " + Arrays.toString(beanFactory.getBeanNamesForType(Dog.class)));
    }
}
