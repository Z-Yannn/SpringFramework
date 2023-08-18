package com.bocloud.spring.configuration.c_conditional;

import com.bocloud.spring.configuration.c_conditional.anno.ConditionalOnBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.List;
import java.util.Map;

public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
        Class<?>[] classes = (Class<?>[]) attributes.get("value");
        for (Class<?> clazz : classes){
            if (!context.getBeanFactory().containsBeanDefinition(clazz.getName())){
                return false;
            }
        }

        // 先获取目标自定义注解ConditionalOnBean上的beanNames属性
        String[] beanNames = (String[]) metadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");
        for (String beanName: beanNames){
            // 逐个校验IOC容器中是否包含传入的bean名称
            if (!context.getBeanFactory().containsBeanDefinition(beanName)){
                return false;
            }
        }
        return true;
    }
}
