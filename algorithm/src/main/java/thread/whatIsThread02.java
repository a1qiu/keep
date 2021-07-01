package thread;

/**
 * @author mawei
 * @date 6/21/21
 */
public class whatIsThread02 {

    public static void main(String[] args) {
//        testSleep();
//        testYield();
        testJoin();

    }

    /**
     * 我肯定会出让一下cpu ,但是另一个线程是否能抢到不管
     */
    static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("A" + i);
                if (i % 5 == 1) {
                    Thread.yield();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B" + i);
                if (i % 5 == 1) {
                    Thread.yield();
                }
            }
        }).start();
    }

    static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("A" + i);
                try {
                    Thread.sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    static void testJoin() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("a" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            for (int i = 0; i < 10; i++) {
                System.out.println("b"+i);
                try {
                    if(i==4){
                        t1.join();
                    }
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
