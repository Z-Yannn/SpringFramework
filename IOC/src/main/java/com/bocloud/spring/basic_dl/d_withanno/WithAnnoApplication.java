package com.bocloud.spring.basic_dl.d_withanno;

import com.bocloud.spring.basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Objects;

public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-withanno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) ->{
            System.out.println(beanName + " " + bean);
        });
    }
}
