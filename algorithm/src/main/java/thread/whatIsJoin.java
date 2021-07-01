package thread;

/**
 * @author mawei
 * @date 6/23/21
 *
 */
public class whatIsJoin {
    /**
     * just caclusion
     * 前提：一个mian 线程 一个thread1
     * 开始main 执行，创建thread1 此时thread 处于就绪状态
     * 执行join 后thread1 运行态 并执行结束，main 重新获取cpu 就绪执行 结束
     */
    public static void main(String[] args) {
        try {
            ThreadA t1 = new ThreadA("t1");
            t1.start();
            t1.join();
            System.out.printf("%s finish\n", Thread.currentThread().getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    static class ThreadA extends Thread {
        public ThreadA(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.printf("%s start\n", this.getName());
            // 延时操作
            for (int i = 0; i < 1000000; i++) ;
            System.out.printf("%s finish\n", this.getName());
        }
    }
}


