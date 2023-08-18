package com.bocloud.spring.event.d_payload;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

public class PayloadObjectApplicationListener implements ApplicationListener<PayloadApplicationEvent> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        System.out.println("能监听PayloadApplicationEvent ----> " + event.getPayload());
    }
}
