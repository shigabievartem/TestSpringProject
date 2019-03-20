package com.iteco.spring.task4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.iteco.spring.task4")
public class FirstCircularDependencyBean {
    private SecondCircularDependencyBean bean;

    public FirstCircularDependencyBean(@Lazy SecondCircularDependencyBean bean2) {
        this.bean = bean2;
    }

    public void showMeYourBean() {
        System.out.println("My class: " + this.getClass());
        System.out.println("Inner class: " + bean.getClass());
    }
}
