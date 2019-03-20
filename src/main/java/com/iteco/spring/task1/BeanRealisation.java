package com.iteco.spring.task1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BeanRealisation {
    @Bean(name = "protBean")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public BeanRealisation getSingletonBean() {
        return new BeanRealisation();
    }

    @Bean(name = "singleBean")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public BeanRealisation getPrototypeBean() {
        return new BeanRealisation();
    }

    public void sayHello() {
        System.out.println("Hey dudes!");
    }

}
