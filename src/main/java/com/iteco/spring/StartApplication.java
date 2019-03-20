package com.iteco.spring;

import com.iteco.spring.conditionalAnnotation.BeanWithConditionalAnnotationImpl;
import com.iteco.spring.primaryAnnotation.BeanWithPrimaryAnnotationImpl;
import com.iteco.spring.profileAnnotation.BeanWithProfileAnnotationImpl;
import com.iteco.spring.qualifierAnnotation.BeanWithQualifierAnnotationImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanWithPrimaryAnnotationImpl.class);
        context.getBean(BeanWithPrimaryAnnotationImpl.class).action();

        ApplicationContext contextQual = new AnnotationConfigApplicationContext(BeanWithQualifierAnnotationImpl.class);
        contextQual.getBean(BeanWithQualifierAnnotationImpl.class).action();

        // Запускать с VM Options : -Dspring.profiles.active=secondary или primary
        ApplicationContext contextProfile = new AnnotationConfigApplicationContext(BeanWithProfileAnnotationImpl.class);
        contextProfile.getBean(BeanWithProfileAnnotationImpl.class).action();

        // Запускать с VM Options : -Dspring.profiles.active=secondary или primary
        ApplicationContext contextConditional = new AnnotationConfigApplicationContext(BeanWithConditionalAnnotationImpl.class);
        contextConditional.getBean(BeanWithConditionalAnnotationImpl.class).action();

    }
}
