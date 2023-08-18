package com.bocloud.spring.configuration.a_module;

import com.bocloud.spring.configuration.a_module.component.Bar;
import com.bocloud.spring.configuration.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
        // ImportSelector 不止可以导入   普通类   也可以导入    配置类
    }
}
