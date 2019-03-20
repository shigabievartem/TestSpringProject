package com.iteco.spring.task2;

import org.springframework.stereotype.Component;

@Component
public class NotThreadSafeBeanRealisation {

    // Для расчёта без синхронизации
    private volatile int intValue;
    // Для расчёта в синхронизированном методе
    private volatile int threadIntValue;

    public NotThreadSafeBeanRealisation(int intValue) {
        this.intValue = intValue;
        this.threadIntValue = intValue;
    }

    public NotThreadSafeBeanRealisation() {
        this.intValue = 0;
        this.threadIntValue = 0;
    }

    public synchronized int threadSafeIncrement() {
//        System.out.println(Thread.currentThread().getName() + "| safety increment intValue: " + intValue);
        return threadIntValue++;
    }

    public int incrementInt() {
//        System.out.println("Let's increment intValue: " + intValue);
        return intValue++;
    }

    public int getIntValue() {
        return intValue;
    }

    public int getThreadIntValue() {
        return threadIntValue;
    }
}
