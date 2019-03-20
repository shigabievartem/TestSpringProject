package com.iteco.spring.task1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static com.iteco.spring.utils.SpringTestUtils.doConcurrently;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BeanRealisation.class)
public class Task1 {
    @Autowired @Qualifier("protBean") BeanRealisation protBean1;
    @Autowired @Qualifier("protBean") BeanRealisation protBean2;
    @Autowired @Qualifier("singleBean") BeanRealisation singleBean1;
    @Autowired @Qualifier("singleBean") BeanRealisation singleBean2;

    private static final int THREAD_NUMBER = 10;
    private static final int TASK_NUMBER = 100000;

    @Autowired
    ApplicationContext context;

    @Test
    public void compareBeanScope() {
        Assert.assertEquals(protBean1, protBean2);
        Assert.assertNotEquals(singleBean1, singleBean2);

        System.out.println("Assertion success!");
    }

    /**
     * Метод доказывает, что получение бинов даже в многопоточной среде соответствует ожиданиям
     */
    @Test
    public void testGetBean() throws InterruptedException {
        BeanRealisation bean = (BeanRealisation) context.getBean("singleBean");
        BeanRealisation protBean = (BeanRealisation) context.getBean("protBean");
        doConcurrently(THREAD_NUMBER, TASK_NUMBER, () -> {
            Assert.assertEquals(bean, context.getBean("singleBean"));
            Assert.assertNotEquals(protBean, context.getBean("protBean"));
        });
    }
}
