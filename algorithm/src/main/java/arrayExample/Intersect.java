package arrayExample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author mawei
 * @date 11/20/20
 * 两个数组交集
 */
public class Intersect {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 9, 5};
        int[] arr2 = new int[]{9, 4, 9, 8, 4};
        int[] temp = getIntersect(arr1, arr2);
        for (int a : temp) {
            System.out.print(a + " ");
        }
    }

    @Test
    public static int[] getIntersect(int[] arr1, int[] arr2) {
        //先排序
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int k = 0;
        for (int i = 0, j = 0; i < arr1.length && j < arr2.length;) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                arr1[k++] = arr1[i++];
                j++;

            }
        }
        return Arrays.copyOfRange(arr1, 0, k);
    }
}
