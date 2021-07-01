package dp;

/**
 * @author mawei
 * @date 12/10/20
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */
public class Uplength {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(upLengthest(arr));
    }

    public static int upLengthest(int[] nums) {
        //非空校验
        if (nums == null || nums.length < 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        for (int num : nums) {
            int i = 0, j = res;
            while (i < j) {
                int m = (i + j) / 2;
                if (dp[m] < num) i = m + 1;
                else j = m;
            }
            dp[i] = num;
            if (res == j) res++;
        }
        return res;
    }
}
