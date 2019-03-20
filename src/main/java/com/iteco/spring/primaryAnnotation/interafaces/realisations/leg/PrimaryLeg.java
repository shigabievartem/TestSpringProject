package com.iteco.spring.primaryAnnotation.interafaces.realisations.leg;

import com.iteco.spring.primaryAnnotation.interafaces.Leg;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
