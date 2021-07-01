package thread;

import java.util.concurrent.TimeUnit;

/**
 * @author mawei
 * @date 6/21/21
 */
public class whatIsThread {
    private static class T1 extends Thread{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                try {
                    TimeUnit.MICROSECONDS.sleep(1);

                }catch (InterruptedException exceptionn){
                    exceptionn.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        new T1().start();
        for (int i = 0; i <10 ; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
