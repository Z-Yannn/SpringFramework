package com.bocloud.spring.configuration.c_conditional.anno;

import com.bocloud.spring.configuration.c_conditional.OnBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {
    Class<?>[] value() default {};
    String[] beanNames() default {};
}

