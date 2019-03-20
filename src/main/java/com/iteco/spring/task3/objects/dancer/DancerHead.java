package com.iteco.spring.task3.objects.dancer;

import com.iteco.spring.task3.objects.Head;
import org.springframework.stereotype.Component;

@Component
public class DancerHead implements Head {

    @Override
    public void tellSomething() {
        System.out.println("Hey, babe! Look at me now!");
    }
}
