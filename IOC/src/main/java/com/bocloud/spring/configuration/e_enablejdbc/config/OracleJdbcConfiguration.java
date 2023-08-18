package com.bocloud.spring.configuration.e_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName("oracle.jdbc.driver.OracleDriver")
public class OracleJdbcConfiguration extends AbstractJdbcConfiguration{
    @Bean
    public DataSource oracleDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl(environment.getProperty("jdbc.oracle.url"));
        dataSource.setUsername(environment.getProperty("jdbc.oracle.username"));
        dataSource.setPassword(environment.getProperty("jdbc.oracle.password"));
        return dataSource;
    }

}
