package current_limit;

/**
 * @author mawei
 * @date 12/9/20
 *
 * 当前qps 当前时间
 * 最大qps 时间窗
 *
 * 问题：理想状态没秒限制100并发请求
 * 0.99 过来100个请求 1.01 又过来1oo个 这样0.03秒过来200 个请求，容易把服务器打挂
 *
 */
public class Count {
    int curQps = 0;
    long lastTime = System.currentTimeMillis();
    int maxQps = 100;
    Object lock = new Object();

    boolean check() {
        synchronized (lock) {
            long now = System.currentTimeMillis();
            if (now > lastTime + 1000) {
                lastTime = now;
                curQps = 0;
            }
            curQps++;
            if (curQps > maxQps) {
                return false;
            }
        }
        return true;
    }
}
