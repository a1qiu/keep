/**
 * @author mawei
 * @date 1/4/21
 */
public class Search {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        System.out.println(searchExits(arr, target));
        System.out.println("*********");
        System.out.println(search(arr, target));
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static boolean searchExits(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[start] == nums[mid]) {
                ++start;

            } else if (nums[mid] <= nums[end]) {
                //右边区域有序
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //左边有序
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }
            if (nums[mid] > nums[left]) {
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                }
            } else if (nums[mid] < nums[left]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1;
                }
            }
        }
        return false;

    }

    /**
     * 旋转数组 查找最小值
     *
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > nums[right]) left = mid + 1;
            else if (nums[mid] < nums[right]) right = mid;
            else right = right - 1;
        }
        return nums[left];
    }

}