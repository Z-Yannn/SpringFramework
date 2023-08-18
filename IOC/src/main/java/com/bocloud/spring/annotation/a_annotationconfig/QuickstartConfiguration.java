package com.bocloud.spring.annotation.a_annotationconfig;


import com.bocloud.spring.annotation.a_annotationconfig.bean.Cat;
import com.bocloud.spring.annotation.a_annotationconfig.bean.Person;
import org.springframework.context.annotation.Bean;


public class QuickstartConfiguration {
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("ryan");
        person.setAge(123);
        return person;

    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        // 直接拿上面的person()方法作为返回值即可，相当于ref
        cat.setMaster(person());
        return cat;
    }

}
