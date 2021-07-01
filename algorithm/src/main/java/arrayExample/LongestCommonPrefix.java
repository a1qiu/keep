package arrayExample;

/**
 * @author mawei
 * @date 11/20/20
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arrays = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(arrays);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 0)
            return "";
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if (ans == "")
                return ans;
        }
        return ans;
    }
}
