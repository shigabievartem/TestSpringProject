package com.iteco.spring.conditionalAnnotation.interfaces.realisations.leg;

import com.iteco.spring.conditionalAnnotation.conditions.SecondaryCondition;
import com.iteco.spring.conditionalAnnotation.interfaces.Leg;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(SecondaryCondition.class)
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
