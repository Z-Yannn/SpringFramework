package com.bocloud.spring.configuration.c_conditional.selector;

import com.bocloud.spring.configuration.c_conditional.component.Bar;
import com.bocloud.spring.configuration.c_conditional.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
        // ImportSelector 不止可以导入   普通类   也可以导入    配置类
    }
}
