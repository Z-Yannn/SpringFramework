package com.bocloud.spring.environment.a_quickstart.bean;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentAwareBean implements EnvironmentAware {
    private Environment environment;
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    public void printEnvironmentInfo(){
        System.out.println(environment);
    }

}
