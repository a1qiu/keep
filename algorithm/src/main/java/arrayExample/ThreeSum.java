package arrayExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mawei
 * @date 12/1/20
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        getThreeSum(arr).stream().forEach(

                System.out::print

        );
    }

    public static List<List<Integer>> getThreeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> response = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int target = 0 - arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            if (i == 0 || arr[i] != arr[i - 1]) {
                while (left < right) {
                    if (arr[left] + arr[right] == target) {
                        response.add(Arrays.asList(arr[i], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (arr[left] + arr[right] < target) left++;
                    else right--;

                }

            }
        }
        return response;
    }
}
