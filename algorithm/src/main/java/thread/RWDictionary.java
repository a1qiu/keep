package thread;

import javax.xml.crypto.Data;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author mawei
 * @date 6/22/21
 */
public class RWDictionary {
    private final Map<String, Data> m = new TreeMap<>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();


    public Data get(String key) {
        r.lock();
        try {
            return m.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            r.unlock();
        }
        return null;
    }

    public Object[] allKeys() {
        r.lock();
        try {
            return m.keySet().toArray();
        } finally {
            r.unlock();
        }
    }

    public Data put(String key, Data value) {
        w.lock();
        try {
            return m.put(key, value);
        } finally {
            w.unlock();
        }
    }

    public void clear() {
        w.lock();
        try {
            m.clear();
        } finally {
            w.unlock();
        }
    }
}
