package com.iteco.spring.task3;

import com.iteco.spring.task3.objects.Head;
import com.iteco.spring.task3.objects.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.iteco.spring.task3")
public class A {
    Head head;
    Leg leg;

    public A() {
        head = () -> System.out.println("Default speech....");
        leg = () -> System.out.println("Default legs... kill me...");
    }

    @Autowired
    public A(@Qualifier("baskovLeg") Leg leg,@Qualifier("blondie") Head head) {
//    public A(@Qualifier("dancerLeg") Leg leg,@Qualifier("dancerHead") Head head) {
        this.leg = leg;
        this.head = head;
    }

    public void action() {
        System.out.println("My class: " + this.getClass());
        System.out.println("My Head: " + this.head.getClass());
        System.out.println("My Leg: " + this.leg.getClass());
//        head.tellSomething();
//        leg.go();
    }
}
