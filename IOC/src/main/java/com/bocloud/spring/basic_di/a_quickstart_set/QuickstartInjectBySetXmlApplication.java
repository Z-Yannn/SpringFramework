package com.bocloud.spring.basic_di.a_quickstart_set;

import com.bocloud.spring.basic_di.a_quickstart_set.bean.Cat;
import com.bocloud.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person.getName()+" "+person.getAge().toString());

        Cat cat = (Cat) beanFactory.getBean("cat");
        System.out.println(cat.getName()+" "+cat.getMaster().getName());
    }
}
