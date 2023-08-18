package com.bocloud.spring.basic_di.d_complexfield;

import com.bocloud.spring.basic_di.d_complexfield.bean.Cat;
import com.bocloud.spring.basic_di.d_complexfield.bean.Dog;
import com.bocloud.spring.basic_di.d_complexfield.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.bocloud.spring.basic_di.d_complexfield.bean")
public class InjectComplexFieldConfiguration {

    @Bean
    @Autowired
    public Cat cat(Person person){
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setPerson(person);
        return cat;
    }

    @Bean
    @Primary
    public Person master(){
        Person master = new Person();
        master.setName("master");
        return master;
    }

    public Dog dog(){
        return new Dog();
    }

}
