package com.bocloud.spring.bean.b_scope;

import com.bocloud.spring.bean.b_scope.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanScopeAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.bean.b_scope.bean");
        Map<String, Child> children = ctx.getBeansOfType(Child.class);
        children.forEach((name,childName) -> {
            System.out.println(name + ": " + childName);
        });
//        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
//            System.out.println(name + " : " + child);
//        });

    }
}
