package com.bocloud.spring.basic_di.i_lazyinject.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 延迟注入
@Component
public class Dog {
//    private Person person;
//    // setter 的延迟注入 注入时机是创建对象后
//    @Autowired
//    public void setPerson(ObjectProvider<Person> person){
//        this.person = person.getIfAvailable();
//    }
//
//    // 构造器的延迟注入 注入时机是创建对象时
//    @Autowired
//    public Dog(ObjectProvider<Person> person) {
//        // 如果没有Bean，则采用缺省策略创建
//        this.person = person.getIfAvailable(Person::new);
//    }

    // 属性字段的延迟注入  一般不用 否则注入以后 每次用这个bean都得判断一次
    @Autowired
    private ObjectProvider<Person> person;

    @Override
    public String toString() {
        // 每用一次都要getIfAvailable一次
        return "Dog{" + "person=" + person.getIfAvailable(Person::new) + '}';
    }
}
