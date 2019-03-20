package com.iteco.spring.conditionalAnnotation.interfaces.realisations.leg;

import com.iteco.spring.conditionalAnnotation.conditions.PrimaryCondition;
import com.iteco.spring.conditionalAnnotation.interfaces.Leg;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(PrimaryCondition.class)
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
