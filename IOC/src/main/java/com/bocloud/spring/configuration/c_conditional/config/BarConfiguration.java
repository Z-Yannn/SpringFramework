package com.bocloud.spring.configuration.c_conditional.config;

import com.bocloud.spring.configuration.c_conditional.ExistBossCondition;
import com.bocloud.spring.configuration.c_conditional.anno.ConditionalOnBean;
import com.bocloud.spring.configuration.c_conditional.component.Bar;
import com.bocloud.spring.configuration.c_conditional.component.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration

public class BarConfiguration {

    //@Conditional(ExistBossCondition.class)   // 指定bar的创建基于boss
    @Bean
    @ConditionalOnBean(Boss.class)
    public Bar niceBar(){
        return new Bar();
    }
}
