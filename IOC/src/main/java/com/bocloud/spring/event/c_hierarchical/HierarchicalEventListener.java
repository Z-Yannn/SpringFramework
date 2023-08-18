package com.bocloud.spring.event.c_hierarchical;


import org.springframework.context.ApplicationListener;

// 监听器
public class HierarchicalEventListener implements ApplicationListener<HierarchicalEvent> {
    @Override
    public void onApplicationEvent(HierarchicalEvent event) {
        System.out.println("监听到HierarchicalEvent" + event.toString());
    }
}
