package com.bocloud.spring.event.a_quickstart;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedApplicationListener {
    @EventListener
    public void onContextClosedEvent(ContextClosedEvent event){
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件!");
    }
}
