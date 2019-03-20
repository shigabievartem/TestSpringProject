package com.iteco.spring.profileAnnotation.interafaces.realisations.leg;

import com.iteco.spring.profileAnnotation.interafaces.Leg;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("primary")
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
