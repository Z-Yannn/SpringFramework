package com.bocloud.spring.event.a_quickstart;

import com.bocloud.spring.event.a_quickstart.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

// 监听器必须要被扫描到IOC容器才能生效
@Component
public class ContextRefreshedApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedApplicationListener监听到ContextRefreshedEvent事件！");
    }
}

