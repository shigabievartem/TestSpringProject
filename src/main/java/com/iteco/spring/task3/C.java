package com.iteco.spring.task3;

import org.springframework.stereotype.Component;

@Component
public class C extends A {
    public C() {
        this.head = () -> {};
        this.leg = () -> {};
    }

}
