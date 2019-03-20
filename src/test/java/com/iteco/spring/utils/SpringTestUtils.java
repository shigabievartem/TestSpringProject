package com.iteco.spring.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SpringTestUtils {

    /**
     * Запустить поток
     *
     * @param threadNumber - кол-во потоков в пуле
     * @param taskNumber   - кол-во потоков
     * @param task         - задача для выполнения в потоке
     */
    public static void doConcurrently(
            final int threadNumber,
            final int taskNumber,
            final Runnable task
    ) throws InterruptedException {
        final ExecutorService pool = Executors.newFixedThreadPool(threadNumber);
        final CountDownLatch done = new CountDownLatch(taskNumber);
        try {
            for (int i = taskNumber; i > 0; i--) {
                pool.submit(() -> {
                    try {
                        task.run();
                    } finally {
                        done.countDown();
                    }
                });
            }
            done.await(10, TimeUnit.SECONDS);
        } finally {
            pool.shutdownNow();
        }
    }
}
