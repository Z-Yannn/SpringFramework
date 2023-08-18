package com.bocloud.spring.basic_di.d_complexfield;

import com.bocloud.spring.basic_di.d_complexfield.bean.Bird;
import com.bocloud.spring.basic_di.d_complexfield.bean.Cat;
import com.bocloud.spring.basic_di.d_complexfield.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class InjectComplexFieldAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        String[] names = ctx.getBeanDefinitionNames();
        Stream.of(names).forEach(System.out::println);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        Bird bird = ctx.getBean(Bird.class);
        System.out.println(bird);
    }
}
