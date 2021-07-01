package RabinKarp;

import org.junit.Test;

/**
 * @author mawei
 * @date 6/30/21
 */
public class RabinKarp {
    /**
     * 前提没有hash 碰撞
     */

    public int strStr2(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        if (source.length() < target.length()) {
            return -1;
        }
        if (target.length() == 0) {
            return 0;
        }

        final int MAGIC_NUM = 31;
        final int MODE = 1000007;

        int highestPower = 1;
        for (int i = 0; i < target.length(); i++) {
            highestPower = (highestPower * MAGIC_NUM) % MODE;
        }

        // init sourceHash and targetHash
        int sourceHash = 0;
        int targetHash = 0;
        for (int i = 0; i < target.length(); i++) {
            sourceHash = (((sourceHash + source.charAt(i)) % MODE) * MAGIC_NUM) % MODE;
            targetHash = (((targetHash + target.charAt(i)) % MODE) * MAGIC_NUM) % MODE;
        }

        // "i + (target.length() - 1) < source.length()" is for limit of "i + j"
        for (int i = 0; i + (target.length() - 1) < source.length(); i++) {
            //update sourceHash
            if (i - 1 >= 0) {
                // for this problem, pre-calculating highestPower is necessary to avoid TLE...T_T
                int minus = (source.charAt(i - 1) * highestPower) % MODE;
                sourceHash = (sourceHash + (MODE - minus)) % MODE;
                sourceHash = (((sourceHash + source.charAt(i + target.length() - 1)) % MODE) * MAGIC_NUM) % MODE;
            }
            //judge
            if (sourceHash == targetHash) {
                for (int j = 0; j < target.length(); j++) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        return -1;
                    }
                }
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        RabinKarp rabinKarp = new RabinKarp();
        System.out.println(rabinKarp.strStr2("abcdeseedf", "a"));
    }

    @Test
    public void testThreadLocalMap() {
        /**
         * hash 碰撞解决方式
         * 拉链法：hashmap 注意头插入还是尾巴，数组+链表  超级变化形态 红黑树
         * rehash :bloomfilter
         * 开放寻址：threadLocalMap
         */
        ThreadLocal threadLocal;
    }
}
