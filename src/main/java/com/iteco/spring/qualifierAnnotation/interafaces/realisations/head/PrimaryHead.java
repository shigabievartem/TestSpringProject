package com.iteco.spring.qualifierAnnotation.interafaces.realisations.head;

import com.iteco.spring.qualifierAnnotation.interafaces.Head;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("primaryHead")
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
