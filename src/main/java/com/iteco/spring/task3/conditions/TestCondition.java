package com.iteco.spring.task3.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TestCondition implements Condition {

    public static final String PROP_NAME = "beanProp";

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return "a".equalsIgnoreCase(conditionContext.getEnvironment().getProperty(PROP_NAME));
    }
}
