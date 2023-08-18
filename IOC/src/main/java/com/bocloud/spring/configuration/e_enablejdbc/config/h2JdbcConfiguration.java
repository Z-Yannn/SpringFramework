package com.bocloud.spring.configuration.e_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName("org.h2.Driver")
public class h2JdbcConfiguration extends AbstractJdbcConfiguration{
    @Bean
    public DataSource h2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}
