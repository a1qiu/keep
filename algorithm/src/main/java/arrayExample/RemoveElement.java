package arrayExample;

/**
 * @author mawei
 * @date 11/30/20
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] arr, int val) {
        int ans = 0;
        for (int num : arr) {
            if (num != val) {
                arr[ans] = num;
                ans++;
            }
        }
        return ans;
    }
}
