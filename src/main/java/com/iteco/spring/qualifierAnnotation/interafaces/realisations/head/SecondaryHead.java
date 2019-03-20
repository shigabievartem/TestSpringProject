package com.iteco.spring.qualifierAnnotation.interafaces.realisations.head;

import com.iteco.spring.qualifierAnnotation.interafaces.Head;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("secondaryHead")
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
