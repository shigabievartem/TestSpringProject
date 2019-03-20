package com.iteco.spring.primaryAnnotation.interafaces.realisations.head;

import com.iteco.spring.primaryAnnotation.interafaces.Head;
import org.springframework.stereotype.Component;

@Component
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
