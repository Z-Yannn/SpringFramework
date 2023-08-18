package com.bocloud.spring.basic_dl.e_lazylookup;

import com.bocloud.spring.basic_dl.e_lazylookup.bean.Cat;
import com.bocloud.spring.basic_dl.e_lazylookup.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLookupApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart-lazylookup.xml");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException   xml里缺dog
        // Dog dog = ctx.getBean(Dog.class);

        ObjectProvider<Dog> dogObjectProvider = ctx.getBeanProvider(Dog.class);
//        Dog dog = dogObjectProvider.getIfAvailable();
//        if (dog == null){
//            dog = new Dog();
//        }
        Dog dog = dogObjectProvider.getIfAvailable(Dog::new);
    }
}
