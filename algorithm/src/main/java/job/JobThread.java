package job;

/**
 * @author mawei
 * @date 6/23/21
 */
public class JobThread {
    public static class Demo1 {
        static long count = 0;

        public static void main(String[] args) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                            count++;
                            System.out.println(count);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
