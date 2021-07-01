/**
 * @author mawei
 * @date 12/22/20
 */
public class binarySearch {
    public static int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + ((right - left) >> 1);//计算 mid 时 ，不能使用 （left + right ）/ 2,否则有可能会导致溢出
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }

        }
        //不存在
        return -1;
    }

    //二分查找的递归
    public static int binarySearch2(int[] nums, int left, int right, int target) {
        int mid = left + ((right - left) >> 1);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else if (nums[mid] > target) {
            return binarySearch(nums, left, mid - 1, target);
        }
        //不存在
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {//括号内为 left <= right
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;//left = mid + 1
            } else if (nums[mid] > target) {
                right = mid - 1;// right = mid - 1;/
            }
        }
        return left;
    }

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     * 输入：nums = [5,7,7,8,8,10], target = 8 输出：[3,4]
     */
    public int[] searchRange(int[] nums, int target) {
        int uper = upperBound(nums, target);
        int low = lowerBound(nums, target);
        if (uper < low) {
            return new int[]{-1, -1};
        }
        return new int[]{low, uper};
    }

    int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] <= target) {
                left = mid + 1;
            }
        }
        return right;
    }

    int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int upperBoundnum(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + (right - left) >> 1);

            if (nums[mid] < target) {
                if (mid == right || nums[mid + 1] >= target) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 一个无序的数组如果可以拆成两个有序数组，则三个指针  规则左加右减
     * 如果left<mid 则两个指针在同一个数组 如果在同一个数组则target
     * 情况有两种：在mid 左侧     target  >=  nums[left] &&  target < nums[mid] ----- right = mid -1
     * 在mid 右侧  target > nums[mid] || target < nums[left]   left = mid + 1
     * 如果left>mid 则两个指针在不同的数组
     * . target <= nums[right] && target > nums[mid]
     * target > nums[right] || target < nums[mid]
     */
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + (right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            // mid left 落在同侧
            if (nums[mid] >= nums[left]) {
                //target 落在mid 和left之间
                if (nums[mid] > target && target >= nums[left]) {
                    right = mid - 1;
                } else if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1;
                }
            } else if (nums[mid] < nums[left]) {
                //mid left 不落在同一侧
                if (nums[mid] > target && target <= nums[right]) {
                    left = mid + 1;
                } else if (target < nums[mid] || target > nums[right]) {
                    right = mid + 1;
                }
            }
        }
        return -1;
    }

}
