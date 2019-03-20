package com.iteco.spring.task4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {FirstCircularDependencyBean.class, SecondCircularDependencyBean.class})
public class Task4 {

    @Autowired
    FirstCircularDependencyBean bean1;

    @Autowired
    SecondCircularDependencyBean bean2;

    @Autowired
    ThirdCircularDependencyBean bean3;

    @Test
    public void test1() {
        bean1.showMeYourBean();
        bean2.showMeYourBean();
        bean3.showMeYourBean();
    }

    @Test
    public void test123() {
        List<? extends Object> list1 = Arrays.asList(1,2,3,4,5);

        List<? super Integer> list3 = new ArrayList<Object>();
        List<? super Integer> list4 = new ArrayList<Integer>();

        System.out.println(list1.get(1));


        list3.add(12);
        System.out.println(list3.get(0));
    }
}
