package com.bocloud.spring.basic_dl.c_oftype;

import com.bocloud.spring.basic_dl.c_oftype.dao.DemoDao;
import com.bocloud.spring.basic_dl.c_oftype.dao.impl.DemoMySQLDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class OfTypeApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/oftype.xml");
        //DemoDao.class作为参数传递给getBeansOfType()方法时，将返回所有实现DemoDao接口的类的bean实例
        //如果没有任何类实现DemoDao接口，那么beans将为空，即一个空的Map对象
        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);

        beans.forEach((beanName, bean) -> {
            System.out.println(beanName + ": "+  bean.toString());
        });


    }
}
