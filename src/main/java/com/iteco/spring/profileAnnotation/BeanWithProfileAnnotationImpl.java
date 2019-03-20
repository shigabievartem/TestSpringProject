package com.iteco.spring.profileAnnotation;

import com.iteco.spring.profileAnnotation.interafaces.Head;
import com.iteco.spring.profileAnnotation.interafaces.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iteco.spring.profileAnnotation")
public class BeanWithProfileAnnotationImpl {

    @Autowired
    Head head;
    @Autowired
    Leg leg;

    public void action() {
        System.out.println("Head: " + head.getClass());
        System.out.println("Leg: " + leg.getClass());
    }
}
