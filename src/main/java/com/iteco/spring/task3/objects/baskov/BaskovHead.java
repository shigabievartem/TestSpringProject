package com.iteco.spring.task3.objects.baskov;

import com.iteco.spring.task3.objects.Head;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("blondie")
public class BaskovHead implements Head {
    @Override
    public void tellSomething() {
        System.out.println("Everyone must listen just me! i'm blondie guy!");
    }
}
