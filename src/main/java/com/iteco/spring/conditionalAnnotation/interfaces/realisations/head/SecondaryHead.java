package com.iteco.spring.conditionalAnnotation.interfaces.realisations.head;

import com.iteco.spring.conditionalAnnotation.interfaces.Head;

public class SecondaryHead implements Head {
    @Override
    public void think() {
        System.out.println("Thinking about secondary things!");
    }

    @Override
    public void tellSomething() {
        System.out.println("Talking about secondary things!");
    }
}
