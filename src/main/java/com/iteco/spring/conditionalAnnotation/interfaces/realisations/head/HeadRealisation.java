package com.iteco.spring.conditionalAnnotation.interfaces.realisations.head;

import com.iteco.spring.conditionalAnnotation.conditions.PrimaryCondition;
import com.iteco.spring.conditionalAnnotation.conditions.SecondaryCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iteco.spring.conditionalAnnotation.interfaces.realisations.head")
public class HeadRealisation {
    @Bean(name="head")
    @Conditional(PrimaryCondition.class)
    public PrimaryHead primaryConfig() {
        return new PrimaryHead();
    }

    @Bean(name="head")
    @Conditional(SecondaryCondition.class)
    public SecondaryHead secondaryConfig() {
        return new SecondaryHead();
    }
}
