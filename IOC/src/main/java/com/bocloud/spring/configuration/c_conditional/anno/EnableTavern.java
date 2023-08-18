package com.bocloud.spring.configuration.c_conditional.anno;

import com.bocloud.spring.configuration.c_conditional.component.Boss;
import com.bocloud.spring.configuration.c_conditional.config.BartenderConfiguration;
import com.bocloud.spring.configuration.c_conditional.registrar.WaiterRegistrar;
import com.bocloud.spring.configuration.c_conditional.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

// 声明自定义注解
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  // 注解在运行时起效 并且只能标注在类上
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})  // 如果标注了 @EnableTavern 注解，就会触发 @Import 的效果，向容器中导入一个 Boss 类型的 Bean

public @interface EnableTavern {
}
