package com.bocloud.spring.event.b_registerevent.Listener;

import com.bocloud.spring.event.b_registerevent.Event.RegisterSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderListener {
    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送站内信。。。");
    }
    @EventListener
    public void onRegisterSuccess2(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送email。。。");
    }
}
