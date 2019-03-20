package com.iteco.spring.conditionalAnnotation.interfaces.realisations.head;

import com.iteco.spring.conditionalAnnotation.interfaces.Head;

public class PrimaryHead implements Head {
    @Override
    public void think() {
        System.out.println("Thinking about primary things!");
    }

    @Override
    public void tellSomething() {
        System.out.println("Talking about primary things!");
    }
}
