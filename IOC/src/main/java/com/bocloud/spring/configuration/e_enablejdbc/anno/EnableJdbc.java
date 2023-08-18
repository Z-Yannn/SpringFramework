package com.bocloud.spring.configuration.e_enablejdbc.anno;

import com.bocloud.spring.configuration.e_enablejdbc.config.AbstractJdbcConfiguration;
import com.bocloud.spring.configuration.e_enablejdbc.config.MySQLJdbcConfiguration;
import com.bocloud.spring.configuration.e_enablejdbc.config.OracleJdbcConfiguration;
import com.bocloud.spring.configuration.e_enablejdbc.selector.JdbcConfigSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({JdbcConfigSelector.class, AbstractJdbcConfiguration.class, MySQLJdbcConfiguration.class, OracleJdbcConfiguration.class})
public @interface EnableJdbc {
}
