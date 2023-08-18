package com.bocloud.spring.postprocessor.e_beforeinstantiation;

import com.bocloud.spring.postprocessor.e_beforeinstantiation.bean.Ball;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationAwareApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "postprocessor/before-instantiation.xml");
        Ball ball = (Ball) ctx.getBean("ball");
        System.out.println(ball);

        Ball ball2 = (Ball) ctx.getBean("ball2");
        System.out.println(ball2);
    }
}
