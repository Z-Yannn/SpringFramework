package com.bocloud.spring.event.b_registerevent.Service;

import com.bocloud.spring.event.b_registerevent.Event.RegisterSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
// 用 ApplicationEventPublisher 发布事件

@Service
public class RegisterService implements ApplicationEventPublisherAware {
    ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void register(String username){
        // 用户注册
        System.out.println(username + "注册成功。。。");

        // 发布事件
        publisher.publishEvent(new RegisterSuccessEvent(username));
    }

}
