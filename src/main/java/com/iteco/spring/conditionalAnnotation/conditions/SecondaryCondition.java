package com.iteco.spring.conditionalAnnotation.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SecondaryCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "secondary".equalsIgnoreCase(context.getEnvironment().getProperty("spring.profiles.active"));
    }
}
