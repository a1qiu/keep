package arrayExample;

/**
 * @author mawei
 * @date 11/30/20
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr) {
        //两个指针
        int p = 0;
        int q = 1;
        while (q < arr.length) {
            if (arr[p] != arr[q]) {
                arr[p + 1] = arr[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
