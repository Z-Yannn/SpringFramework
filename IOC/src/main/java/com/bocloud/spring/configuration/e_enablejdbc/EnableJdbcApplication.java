package com.bocloud.spring.configuration.e_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.e_enablejdbc.anno.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.stream.Stream;

@EnableJdbc
@PropertySource("classpath:enablejdbc/jdbc.properties")
public class EnableJdbcApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
//        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
