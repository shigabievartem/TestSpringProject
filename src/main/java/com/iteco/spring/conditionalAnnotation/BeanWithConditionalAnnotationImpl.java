package com.iteco.spring.conditionalAnnotation;

import com.iteco.spring.conditionalAnnotation.interfaces.Head;
import com.iteco.spring.conditionalAnnotation.interfaces.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iteco.spring.conditionalAnnotation")
public class BeanWithConditionalAnnotationImpl {

    @Autowired
    Head head;
    @Autowired
    Leg leg;

    public void action() {
        System.out.println("Head: " + head.getClass());
        System.out.println("Leg: " + leg.getClass());
    }
}
