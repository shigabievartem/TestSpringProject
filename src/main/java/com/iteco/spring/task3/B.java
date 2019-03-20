package com.iteco.spring.task3;

import org.springframework.stereotype.Component;

@Component
public class B extends A {

    public B() {
        head = () -> System.out.println("Beeep Beep....");
        leg = () -> System.out.println("B-Leg");
    }
}
