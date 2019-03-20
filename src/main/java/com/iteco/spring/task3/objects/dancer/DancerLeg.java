package com.iteco.spring.task3.objects.dancer;

import com.iteco.spring.task3.objects.Leg;
import org.springframework.stereotype.Component;

@Component
public class DancerLeg implements Leg {
    @Override
    public void go() {
        System.out.println("i'm dancing!");
    }
}
