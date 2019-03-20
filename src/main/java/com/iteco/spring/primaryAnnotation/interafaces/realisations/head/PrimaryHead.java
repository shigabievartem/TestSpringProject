package com.iteco.spring.primaryAnnotation.interafaces.realisations.head;

import com.iteco.spring.primaryAnnotation.interafaces.Head;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
