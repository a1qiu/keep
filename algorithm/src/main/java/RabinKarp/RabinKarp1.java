package RabinKarp;

/**
 * @author mawei
 * @date 6/30/21
 */
public class RabinKarp1 {
    //只是一个素数越大hash 碰撞越低;M = BigInteger.valueOf((long) Math.pow(10, 18)).nextProbablePrime().longValue();
    private static long M = 1000000000000000003L;
    private static int R = 21;
    private long patternHash;
    private long RK;
    private int K;

    public RabinKarp1(String pattern) {
        patternHash = hash(pattern);
        K = pattern.length();

        // 计算RM
        RK = 1;
        for (int i = 0; i < K; i++) {
            RK = (R * RK) % M;
        }
    }

    public int search(String txt) {
        long substrHash = hash(txt, 0, K);
        //一开始就匹配成功
        if (substrHash == patternHash) {
            return 0;
        }
        for (int i = 1; i + K <= txt.length(); i++) {
            // H(i+1) % M = [H(i) % M * R + s[i+k] - s[i] * R^k % M + M] % M
            substrHash = (substrHash * R + txt.charAt(i + K - 1) - txt.charAt(i - 1) * RK % M + M) % M;
            if (substrHash == patternHash)
                return i;
        }
        return -1;
    }

    // Horner rule 计算字符串hash值
    private long hash(String str, int start, int length) {
        long hash = 0;
        for (int i = start; i < length; i++) {
            hash = (hash * R + str.charAt(i)) % M;
        }
        return hash;
    }

    private long hash(String str) {
        return hash(str, 0, str.length());
    }


    public static void main(String[] args) {
//        System.out.println(BigInteger.valueOf((long) Math.pow(10, 18)).nextProbablePrime().longValue());
        String pattern = "c";
        RabinKarp1 rk = new RabinKarp1(pattern);
        String txt = "abc";

        int index = rk.search(txt);
        if (index >= 0) {
            for (int i = 0; i < index; i++) {
                System.out.print(" ");
            }
            System.out.print(pattern);
        }
    }
}
