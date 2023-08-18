package com.bocloud.spring.postprocessor.i_registryprocessor;

import com.bocloud.spring.postprocessor.i_registryprocessor.bean.Cat;
import com.bocloud.spring.postprocessor.i_registryprocessor.bean.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

// 向 BeanFactory 中注册新的 BeanDefinition
// 有一个 Animal 的抽象动物类，两个具体的动物类 Cat 和 Dog 。
// 一开始 IOC 容器中只注册 Cat ，没有 Dog ，,
// 使用 BeanDefinitionRegistryPostProcessor 注册一个 Dog 的对象，然后利用 BeanFactoryPostProcessor 给所有的 Animal 对象的属性赋值
public class RegistryPostProcessorApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.bocloud.spring.postprocessor.i_registryprocessor");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
