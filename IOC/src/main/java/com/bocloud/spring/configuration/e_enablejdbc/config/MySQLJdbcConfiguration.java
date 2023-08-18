package com.bocloud.spring.configuration.e_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bocloud.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClassName("com.mysql.jdbc.Driver")
public class MySQLJdbcConfiguration extends AbstractJdbcConfiguration{
    @Bean
    @ConditionalOnClassName("com.mysql.jdbc.Driver")
    public DataSource mysqlDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(environment.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.mysql.password"));
        return dataSource;
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}
