package com.iteco.spring.task2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static com.iteco.spring.utils.SpringTestUtils.doConcurrently;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NotThreadSafeBeanRealisation.class)
public class Task2 {
    private static final int THREAD_NUMBER = 10;
    private static final int TASK_NUMBER = 100000;


    @Autowired
    @Qualifier("notThreadSafeBeanRealisation")
    NotThreadSafeBeanRealisation bean;

    /**
     * Метод доказывает, что бины потоко не безопасны
     */
    @Test
    public void beansNoThreadSafe() throws InterruptedException {
        doConcurrently(THREAD_NUMBER, TASK_NUMBER, () -> {
            bean.incrementInt();
            bean.threadSafeIncrement();
        });

        System.out.println("Thread safe int: " + bean.getThreadIntValue() + "\nNot thread safe int: " + bean.getIntValue());

        Assert.assertNotEquals(TASK_NUMBER, bean.getIntValue());
        Assert.assertEquals(TASK_NUMBER, bean.getThreadIntValue());
    }
}