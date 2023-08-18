package com.bocloud.spring.event.d_payload;

import com.bocloud.spring.basic_di.a_quickstart_set.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PayloadEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.addApplicationListener(new PayloadObjectApplicationListener());
        ctx.addApplicationListener(new PayloadIntegerApplicationListener());

        ctx.refresh();

        ctx.publishEvent("hahaha");
        ctx.publishEvent(123456789);
        ctx.publishEvent(new Person());

    }
}

/*如果不指定具体的泛型，则会监听所有的 PayloadApplicationEvent 事件
  在 PayloadApplicationEvent 的事件上指定具体的泛型类型，则只会监听该泛型类型的 PayloadApplicationEvent 事件
  [Output]:
  能监听PayloadApplicationEvent ----> hahaha
  能监听PayloadApplicationEvent ----> 123456789
  能监听PayloadApplicationEvent[Integer] ----> 123456789
  能监听PayloadApplicationEvent ----> com.bocloud.spring.basic_di.a_quickstart_set.bean.Person@6ddf90b0
*/
