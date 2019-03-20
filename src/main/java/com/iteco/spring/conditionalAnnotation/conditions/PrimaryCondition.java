package com.iteco.spring.conditionalAnnotation.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PrimaryCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "primary".equalsIgnoreCase(context.getEnvironment().getProperty("spring.profiles.active"));
    }
}
