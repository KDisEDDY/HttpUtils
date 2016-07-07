package project.ljy.httputils.utils.threadpool;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 * Created by liujy006 on 2016/6/3.
 */
public class ThreadPool {
    // 阻塞队列最大任务数量
    static final int BLOCKING_QUEUE_SIZE = 20;
    static final int THREAD_POOL_MAX_SIZE = 10;

    static final int THREAD_POOL_SIZE = 6;

    static ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(BLOCKING_QUEUE_SIZE);

    private static ThreadPool instance;

    static AbstractExecutorService pool = new ThreadPoolExecutor(
            ThreadPool.THREAD_POOL_SIZE,
            ThreadPool.THREAD_POOL_MAX_SIZE, 15L, TimeUnit.SECONDS,
            ThreadPool.arrayBlockingQueue,
            new ThreadPoolExecutor.DiscardOldestPolicy());

    public static ThreadPool getInstance() {
        if (null == instance) {
            instance = new ThreadPool();
        }
        return instance;
    }

    public void removeAllTasks() {
        arrayBlockingQueue.clear();
    }

    public Object removeTask(Object obj) {
        return arrayBlockingQueue.remove(obj);
    }


    /**
     * 关闭，并等待任务执行完成，不接受新任务
     */
    public void shutdown() {
        if (instance.pool != null) {
            instance.pool.shutdown();
        }
    }

    public void shutdownrightNow() {
        if (pool != null) {
            pool.shutdownNow();
        }
        try {
            // 设置超时极短，强制关闭所有任务
            pool.awaitTermination(1,
                    TimeUnit.MICROSECONDS);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行任务
     * @param r
     */
    public void excute(Runnable r) {
        if (r != null) {
            try {
                pool.execute(r);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
}
