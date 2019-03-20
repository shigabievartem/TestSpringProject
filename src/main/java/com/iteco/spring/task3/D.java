package com.iteco.spring.task3;

import org.springframework.stereotype.Component;

@Component
public class D extends B {
    public D() {
        this.head = () -> {};
        this.leg = () -> {};
    }
}
