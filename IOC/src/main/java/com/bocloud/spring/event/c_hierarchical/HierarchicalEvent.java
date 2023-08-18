package com.bocloud.spring.event.c_hierarchical;

import org.springframework.context.ApplicationEvent;

// ApplicationContext具有层次性
// 事件
public class HierarchicalEvent extends ApplicationEvent {
    public HierarchicalEvent(Object source) {
        super(source);
    }
}
