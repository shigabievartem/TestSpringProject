package com.iteco.spring.task3.objects.baskov;

import com.iteco.spring.task3.objects.Leg;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("baskovLeg")
public class BaskovLeg implements Leg {
    @Override
    public void go() {
        System.out.println("I'm jumping around the scene like stung \\о/");
    }
}
