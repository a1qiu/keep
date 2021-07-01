package job;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author mawei
 * @date 6/23/21
 */
public class ThreadPoolExecutorDemo {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    //任务队列100
    private static final int QUEUE_CAPACITY = 100;
    private static final long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
            Runnable worker = new MyRunnable("" + i);
            executor.execute(worker);
        }
        //终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
    /**
     * pool-1-thread-5 Start. Time = Wed Jun 23 15:02:31 CST 2021
     * pool-1-thread-5End .TimeWed Jun 23 15:02:36 CST 2021
     * pool-1-thread-4End .TimeWed Jun 23 15:02:36 CST 2021
     * pool-1-thread-1End .TimeWed Jun 23 15:02:36 CST 2021
     * pool-1-thread-2End .TimeWed Jun 23 15:02:36 CST 2021
     * pool-1-thread-3End .TimeWed Jun 23 15:02:36 CST 2021
     * pool-1-thread-2 Start. Time = Wed Jun 23 15:02:36 CST 2021
     * pool-1-thread-1 Start. Time = Wed Jun 23 15:02:36 CST 2021
     * pool-1-thread-4 Start. Time = Wed Jun 23 15:02:36 CST 2021
     * pool-1-thread-5 Start. Time = Wed Jun 23 15:02:36 CST 2021
     * pool-1-thread-3 Start. Time = Wed Jun 23 15:02:36 CST 2021
     * pool-1-thread-1End .TimeWed Jun 23 15:02:41 CST 2021
     * pool-1-thread-5End .TimeWed Jun 23 15:02:41 CST 2021
     * pool-1-thread-3End .TimeWed Jun 23 15:02:41 CST 2021
     * pool-1-thread-2End .TimeWed Jun 23 15:02:41 CST 2021
     * pool-1-thread-4End .TimeWed Jun 23 15:02:41 CST 2021
     * Finished all threads
     *
     * 执行结果如上，线城池每次会执行5个任务，5个任务执行之后才会执行其他
     */
}
