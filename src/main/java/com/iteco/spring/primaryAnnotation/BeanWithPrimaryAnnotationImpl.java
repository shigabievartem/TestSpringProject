package com.iteco.spring.primaryAnnotation;

import com.iteco.spring.primaryAnnotation.interafaces.Head;
import com.iteco.spring.primaryAnnotation.interafaces.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iteco.spring.primaryAnnotation")
public class BeanWithPrimaryAnnotationImpl {

    @Autowired
    Head head;
    @Autowired
    Leg leg;

    public void action() {
        System.out.println("BeanWithPrimaryAnnotationImpl initialized!");
        System.out.println("Time to thinking...");
        head.think();
        head.tellSomething();
        System.out.println("Don't stop! lets go!");
        leg.walk();
        leg.jump();

    }
}
