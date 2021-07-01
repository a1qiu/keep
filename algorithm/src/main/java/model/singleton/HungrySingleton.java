package model.singleton;

/**
 * @author mawei
 * @date 12/2/20
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有构造方法
    private HungrySingleton() {

    }

    //提供一个对外静态共有方法
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
