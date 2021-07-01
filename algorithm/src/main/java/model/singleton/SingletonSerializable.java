package model.singleton;

import java.io.Serializable;

/**
 * @author mawei
 * @date 12/2/20
 */
public class SingletonSerializable implements Serializable {
    private SingletonSerializable singletonSerializable = null;

    private SingletonSerializable() {
        throw new RuntimeException("非单例、");
    }

    public SingletonSerializable getInstance() {
        if (singletonSerializable == null) {
            synchronized (SingletonSerializable.class) {
                if (singletonSerializable == null) {
                    singletonSerializable = new SingletonSerializable();
                }
            }
        }
        return singletonSerializable;
    }

    public Object readResolve() {
        return singletonSerializable;
    }
}
