package com.bocloud.spring.basic_dl.a_quickstart_byname;

import com.bocloud.spring.basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartByNameApplication {
    public static void main(String[] args) {
        // 读取配置文件需要一个载体来加载 这里使用ClassPathXmlApplicationContext
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}

