package com.iteco.spring.qualifierAnnotation.interafaces.realisations.leg;

import com.iteco.spring.qualifierAnnotation.interafaces.Leg;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("primaryLeg")
public class PrimaryLeg implements Leg {
    @Override
    public void walk() {
        System.out.println("I'm on primary road!");
    }

    @Override
    public void jump() {
        System.out.println("Jump over primary barrier!");
    }
}
