package com.bocloud.spring.configuration.d_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.d_enablejdbc.bean.EnableJdbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

@EnableJdbc
public class EnableJdbcApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
        DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());

        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
