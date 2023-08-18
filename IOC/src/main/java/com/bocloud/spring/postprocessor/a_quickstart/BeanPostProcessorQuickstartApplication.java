package com.bocloud.spring.postprocessor.a_quickstart;

import com.bocloud.spring.basic_dl.d_withanno.BeanNamesApplication;
import com.bocloud.spring.postprocessor.a_quickstart.bean.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yaml.snakeyaml.events.Event;

import java.util.Map;
import java.util.stream.Stream;

public class BeanPostProcessorQuickstartApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.bocloud.spring.postprocessor.a_quickstart.bean");
        ctx.close();
    }
}
