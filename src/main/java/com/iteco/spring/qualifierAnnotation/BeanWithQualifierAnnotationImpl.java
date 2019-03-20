package com.iteco.spring.qualifierAnnotation;

import com.iteco.spring.qualifierAnnotation.interafaces.Head;
import com.iteco.spring.qualifierAnnotation.interafaces.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iteco.spring.qualifierAnnotation")
public class BeanWithQualifierAnnotationImpl {

    @Autowired
    @Qualifier("primaryHead")
    Head head;
    @Autowired
    @Qualifier("secondaryLeg")
    Leg leg;

    public void action() {
        System.out.println("Head: " + head.getClass());
        System.out.println("Leg: " + leg.getClass());
    }
}
