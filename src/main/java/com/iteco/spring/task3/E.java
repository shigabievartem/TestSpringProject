package com.iteco.spring.task3;

import org.springframework.stereotype.Component;

@Component
public class E extends B {
    public E() {
        this.head = () -> {};
        this.leg = () -> {};
    }
}
