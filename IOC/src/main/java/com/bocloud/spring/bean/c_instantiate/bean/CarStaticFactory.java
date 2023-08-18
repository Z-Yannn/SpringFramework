package com.bocloud.spring.bean.c_instantiate.bean;

import com.bocloud.spring.bean.c_instantiate.bean.Car;

public class CarStaticFactory {
    public static Car getCar(){
        return new Car();
    }
}
