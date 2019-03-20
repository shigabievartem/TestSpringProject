package com.iteco.spring.qualifierAnnotation.interafaces.realisations.leg;

import com.iteco.spring.qualifierAnnotation.interafaces.Leg;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("secondaryLeg")
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
