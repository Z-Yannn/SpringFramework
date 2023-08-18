package com.bocloud.spring.basic_dl.d_withanno;

import com.bocloud.spring.basic_dl.d_withanno.anno.Color;
import com.bocloud.spring.basic_dl.d_withanno.bean.Black;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.stream.Stream;
// 获取IOC容器中的所有Bean
public class BeanNamesApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        // 获取所有bean id
        String[] beanNames = ctx.getBeanDefinitionNames();
        // 利用jdk8的Stream快速编写打印办法
        Stream.of(beanNames).forEach(System.out::println);

    }
}
