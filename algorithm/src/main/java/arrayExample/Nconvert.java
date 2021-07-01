package arrayExample;

import java.util.Arrays;

/**
 * @author mawei
 * @date 12/1/20
 */
public class Nconvert {
    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING", 3));
    }

    public static String convert(String s, int rowNums) {
        if (rowNums == 1) return s;
        String[] arr = new String[rowNums];
        Arrays.fill(arr, "");
        int i = 0, flag = -1;
        for (char c : s.toCharArray()
        ) {
            arr[i] += c;
            if (i == 0 || i == rowNums - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (String ch : arr
        ) {
            res.append(ch);
        }
        return res.toString();
    }
}
