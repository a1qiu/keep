package dp;

/**
 * @author mawei
 * @date 12/9/20
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSequenceSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxSumm(arr));

    }

    public static int maxSumm(int[] arr) {
        //非空校验
        if (arr == null || arr.length < 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int i = 0, cur = 0;
        while (i != arr.length) {
            cur += arr[i];
            max = Math.max(max, cur);
            cur = cur < 0 ? 0 : cur;
            i++;
        }
        return max;

    }
}
