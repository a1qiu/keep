package arrayExample;

import java.util.HashMap;

/**
 * @author mawei
 * @date 12/1/20
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] resultArr = twoSum2(nums, 9);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (hashMap.containsKey(target - arr[i])) {
                return new int[]{hashMap.get(target - arr[i]), i};
            }
            //v 是下标
            hashMap.put(arr[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int result = arr[i] + arr[j];
            if (result < target) {
                i++;
            } else if (result > target) {
                j--;
            } else {
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{0, 0};
    }
}
