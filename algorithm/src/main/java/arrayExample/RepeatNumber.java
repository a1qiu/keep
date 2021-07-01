package arrayExample;

import java.util.HashSet;

/**
 * @author mawei
 * @date 12/18/20
 */
public class RepeatNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }

    public static Integer findRepeatNumber(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer num : arr) {
            if (hashSet.contains(num)) return num;
            hashSet.add(num);
        }
        return -1;
    }
}
