package model.singleton;

/**
 * @author mawei
 * @date 12/2/20
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //多线程不安全
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
