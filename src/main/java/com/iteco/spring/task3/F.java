package com.iteco.spring.task3;

import org.springframework.stereotype.Component;

@Component
public class F extends C {
    public F() {
        this.head = () -> {};
        this.leg = () -> {};
    }
}
