package dp;

/**
 * @author mawei
 * @date 12/9/20
 */
public class Floor {
    public static void main(String[] args) {
        System.out.println(climbStaires(3));
        System.out.println(climbStaires01(3));
        // System.out.println(getPow(3, 2));
    }

    //时间复杂度   o(logn)
    public static int climbStaires(int n) {
        double sqrt_5 = Math.sqrt(5);
        double fib_n = Math.pow((1 + sqrt_5) / 2, n + 1) - Math.pow((1 - sqrt_5) / 2, n + 1);
        return (int) (fib_n / sqrt_5);
    }

    //时间复杂度   o(n)
    public static int climbStaires01(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int getPow(int a, int b) {
        double pow = Math.pow(a, b);
        return (int) pow;
    }
}
