package com.bocloud.spring.lifecycle.d_prototype;

import com.bocloud.spring.lifecycle.d_prototype.bean.Pen;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeLifecycleApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrototypeLifecycleConfiguration.class);
        System.out.println("准备获取一个pen");
        Pen pen = ctx.getBean(Pen.class);
        System.out.println("已经获取到一个pen");
        System.out.println("pen finished, ready for destroy");
        ctx.getBeanFactory().destroyBean(pen);
        System.out.println("destroy finished");
    }
}
