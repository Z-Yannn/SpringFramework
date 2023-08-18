package com.bocloud.spring.bean.c_instantiate;

import com.bocloud.spring.bean.c_instantiate.bean.Car;
import com.bocloud.spring.bean.c_instantiate.bean.CarStaticFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class BeanInstantiateXmlApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
//        System.out.println(ctx.getBean(CarStaticFactory.class));
    }

}
