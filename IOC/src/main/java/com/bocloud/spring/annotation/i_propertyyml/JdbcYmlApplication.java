package com.bocloud.spring.annotation.i_propertyyml;

import com.bocloud.spring.annotation.h_propertyxml.JdbcXmlConfiguration;
import com.bocloud.spring.annotation.i_propertyyml.bean.JdbcYmlProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcYmlApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcYmlConfiguration.class);
        System.out.println(ctx.getBean(JdbcYmlProperty.class).toString());
    }
}
