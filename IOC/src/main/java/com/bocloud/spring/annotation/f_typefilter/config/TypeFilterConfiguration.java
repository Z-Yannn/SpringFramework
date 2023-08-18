package com.bocloud.spring.annotation.f_typefilter.config;

import com.bocloud.spring.annotation.f_typefilter.filter.GreenTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.bocloud.spring.annotation.f_typefilter.**",
        excludeFilters = {
                          @ComponentScan.Filter(type = FilterType.CUSTOM, value = GreenTypeFilter.class)})
public class TypeFilterConfiguration {
}






//includeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.bocloud.spring.annotation.f_typefilter.+Demo.+")},
// @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
//                          @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class),