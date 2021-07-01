package arrayExample;

import java.util.Arrays;

/**
 * @author mawei
 * @date 11/30/20
 */
public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        arr = rotate(arr, k);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static int[] rotate(int[] arr, int k) {
        int q = k % arr.length;
        resver(arr, 0, arr.length - 1);
        resver(arr, 0, q - 1);
        resver(arr, q, arr.length - 1);
        return arr;

    }

    public static void resver(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
