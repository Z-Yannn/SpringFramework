package com.bocloud.spring.basic_dl.b_quickstart_bytype;

import com.bocloud.spring.basic_dl.b_quickstart_bytype.bean.Person;
import com.bocloud.spring.basic_dl.b_quickstart_bytype.dao.DemoDao;
import com.bocloud.spring.basic_dl.b_quickstart_bytype.dao.impl.DemoDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-bytype.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = beanFactory.getBean(DemoDao.class);
//        DemoDao demoDao = new DemoDaoImpl();
        System.out.println(demoDao.findAll());
    }
}
