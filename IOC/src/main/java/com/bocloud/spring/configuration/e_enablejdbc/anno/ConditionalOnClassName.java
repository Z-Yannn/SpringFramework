package com.bocloud.spring.configuration.e_enablejdbc.anno;

import com.bocloud.spring.configuration.e_enablejdbc.OnClassNameConditional;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {

    String value();
}

