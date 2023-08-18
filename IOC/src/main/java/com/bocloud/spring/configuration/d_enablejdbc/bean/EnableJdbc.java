package com.bocloud.spring.configuration.d_enablejdbc.bean;

import com.bocloud.spring.configuration.d_enablejdbc.config.JdbcConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JdbcConfiguration.class)
public @interface EnableJdbc {
}
