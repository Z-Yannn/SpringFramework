package com.bocloud.spring.configuration.e_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;


@Configuration
@PropertySource("classpath:enablejdbc/jdbc.properties")
public class AbstractJdbcConfiguration implements EnvironmentAware {
    @Autowired
    Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }




}

