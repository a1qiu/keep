package arrayExample;

import java.util.Arrays;

/**
 * @author mawei
 * @date 12/21/20
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 */
public class MergeArr {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int[] result = mergeArr(nums1, 3, nums2, 3);
        Arrays.stream(result).forEach(System.out::print);
    }

    public static int[] mergeArr(int[] arr1, int length1, int[] arr2, int length2) {
        //因为已经排列好我们将两个指针分别放在两个数组的末尾
        int pos = length1-- + length2-- - 1;
        while (length1 >= 0 && length2 >= 0) {
            arr1[pos--] = arr1[length2] > arr2[length2] ? arr1[length2--] : arr2[length2--];
        }
        while (length2 >= 0) {
            arr1[pos--] = arr2[length2--];
        }
        return arr1;
    }

}
