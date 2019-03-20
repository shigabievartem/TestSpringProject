package com.iteco.spring.profileAnnotation.interafaces.realisations.head;

import com.iteco.spring.profileAnnotation.interafaces.Head;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("primary")
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
