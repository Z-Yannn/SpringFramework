package com.bocloud.spring.event.d_payload;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;

public class PayloadIntegerApplicationListener implements ApplicationListener<PayloadApplicationEvent<Integer>> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent<Integer> event) {
        System.out.println("能监听PayloadApplicationEvent[Integer] ----> " + event.getPayload());
    }
}
