package com.bocloud.spring.bean.a_type.bean;

import com.bocloud.spring.bean.a_type.bean.Ball;
import com.bocloud.spring.bean.a_type.bean.Car;
import com.bocloud.spring.bean.a_type.bean.Child;
import com.bocloud.spring.bean.a_type.bean.Toy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


// 根据小孩子想要玩的玩具来决定生产哪种玩具 注入child到ToyFactoryBean
public class ToyFactoryBean implements FactoryBean<Toy> {
    private Child child;
    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }
    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }

    }

    @Override
    public Class<?> getObjectType() {
        switch (child.getWantToy()) {
            case "ball":
                return Ball.class;
            case "car":
                return Car.class;
            default:
                return null;
        }

    }

    public void setChild(Child child){
        this.child = child;
    }

}
