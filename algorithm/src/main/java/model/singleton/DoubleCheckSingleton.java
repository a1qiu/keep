package model.singleton;

/**
 * @author mawei
 * @date 12/2/20
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
