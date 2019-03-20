package com.iteco.spring.primaryAnnotation.interafaces.realisations.leg;

import com.iteco.spring.primaryAnnotation.interafaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class SecondaryLeg implements Leg {
    @Override
    public void walk() {
        System.out.println("I'm on secondary road!");
    }

    @Override
    public void jump() {
        System.out.println("Jump over secondary barrier!");
    }
}
