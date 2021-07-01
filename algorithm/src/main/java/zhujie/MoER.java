package zhujie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawei
 * @date 4/13/21
 */
public class MoER {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == count) {
                major = nums[i];
            }
            if (major == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }


    public static List<Integer> majorityElement2(int[] nums) {
        //创建返回值
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        //初始化两个候选人和选票信息
        int cand1 = 0, count1 = 0;
        int cand2 = 2, count2 = 0;

        //摩尔计数分为投票和计数阶段
        for (int num : nums) {
            // 投票
            if (cand1 == num) {
                count1++;
                continue;
            }
            if (cand2 == num) {
                count2++;
                continue;
            }

            // 第1个候选人配对
            if (count1 == 0) {
                cand1 = num;
                count1++;
                continue;
            }
            // 第2个候选人配对
            if (count2 == 0) {
                cand2 = num;
                count2++;
                continue;
            }

            count1--;
            count2--;
        }

        // 计数阶段
        // 找到了两个候选人之后，需要确定票数是否满足大于 N/3
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (cand1 == num) count1++;
            else if (cand2 == num) count2++;
        }

        if (count1 > nums.length / 3) res.add(cand1);
        if (count2 > nums.length / 3) res.add(cand2);

        return res;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3, 3, 3, 3, 3,};
        System.out.println(majorityElement(arr));
//        int[] arr2 = {1, 1, 1, 3, 3, 2, 2, 2};
//        System.out.println(majorityElement2(arr2));

    }
}
