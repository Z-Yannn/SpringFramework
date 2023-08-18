package com.bocloud.spring.event.a_quickstart;

import org.springframework.context.ApplicationEvent;

import java.util.EventListener;

// 编写监听器
@FunctionalInterface  // 编译器会在编译时检查该接口是否只包含一个抽象方法。如果接口包含多于一个的抽象方法或继承自Object类的equals、hashCode、toString等方法，则编译器会报错
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    void onApplicationEvent(E event);
}

