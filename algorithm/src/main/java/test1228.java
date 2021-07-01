/**
 * @author mawei
 * @date 12/28/20
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 */
public class test1228 {

    public static boolean judge(int c) {
        if (c < 0) {

            return false;
        }
        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    //回文   aba----ture   abca---remove c 最多删除一个字符
    public static boolean validPalindorme(String a) {

        return false;
    }

    public static int mySqrt(int a) {
        if (a == 0) {
            return 0;
        }
        int left = 1, right = a;
        int mid = 0, sqrt = 0;
        while (left <= right) {
            mid = (left + (right - left) / 2);
            sqrt = a / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static int mySqrt2(int c) {
        long x = c;
        while (x * x > c) {
            x = (x + c / x) / 2;
        }
        return (int) x;
    }

    /**
     * @param nums   原本赠序数组 首位相连位置断开  称为旋转数组
     * @param target
     * @return 154    540   4
     */
    public static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + (right - left) / 2);
            if (nums[mid] == target) {
                return true;
            }
            //无法判断那个区间是增序
            if (nums[left] == nums[target]) {
                ++left;
            } else if (nums[mid] <= nums[right]) {
                //右边区间是递增
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int tes9 = 10;
        System.out.println((int) Math.sqrt(tes9));
        System.out.println(judge(3));
        System.out.println(mySqrt(8));
    }


}
