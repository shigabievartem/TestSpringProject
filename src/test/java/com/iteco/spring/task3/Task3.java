package com.iteco.spring.task3;

import com.iteco.spring.task3.objects.baskov.BaskovHead;
import com.iteco.spring.task3.objects.baskov.BaskovLeg;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = A.class)
public class Task3 {

    @Autowired @Qualifier("a") A aBean;
    @Autowired @Qualifier("b") B bBean;
    @Autowired @Qualifier("c") C cBean;

    @Autowired @Qualifier("b") A abBean;
    @Autowired @Qualifier("c") A acBean;
    @Autowired @Qualifier("d") A adBean;
    @Autowired @Qualifier("e") A aeBean;
    @Autowired @Qualifier("f") A afBean;

    @Test
    public void testEachRealization() {
        Assert.assertNotNull(aBean);
        Assert.assertEquals(aBean.head.getClass(), BaskovHead.class);
        Assert.assertEquals(aBean.leg.getClass(), BaskovLeg.class);
        Assert.assertNotNull(bBean);
        Assert.assertNotNull(cBean);
    }

    @Test
    public void testDifferentARealization(){
        Assert.assertTrue(abBean instanceof B);
        Assert.assertTrue(acBean instanceof C);
        Assert.assertTrue(adBean instanceof D);
        Assert.assertTrue(aeBean instanceof E);
        Assert.assertTrue(afBean instanceof F);
    }
}
