package com.bocloud.spring.event.c_hierarchical;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HierarchicalEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext parentCtx = new AnnotationConfigApplicationContext();
        parentCtx.addApplicationListener(new HierarchicalEventListener());

        AnnotationConfigApplicationContext childCtx = new AnnotationConfigApplicationContext();
        childCtx.setParent(parentCtx);
        childCtx.addApplicationListener(new HierarchicalEventListener());

        // 先刷新父容器，再刷新子容器。如果直接刷新子容器，会抛出 ApplicationEventMulticaster 没有初始化的异常
        parentCtx.refresh();
        childCtx.refresh();

        parentCtx.publishEvent(new HierarchicalEvent("父容器发布的HierarchicalEvent"));
        childCtx.publishEvent(new HierarchicalEvent("子容器发布的HierarchicalEvent"));

    }
}
/*子容器事件会向上传到父容器，父容器不会向下传到子容器
  [output]:
  监听到HierarchicalEventcom.bocloud.spring.event.c_hierarchical.HierarchicalEvent[source=父容器发布的HierarchicalEvent]
  监听到HierarchicalEventcom.bocloud.spring.event.c_hierarchical.HierarchicalEvent[source=子容器发布的HierarchicalEvent]
  监听到HierarchicalEventcom.bocloud.spring.event.c_hierarchical.HierarchicalEvent[source=子容器发布的HierarchicalEvent]
*/
