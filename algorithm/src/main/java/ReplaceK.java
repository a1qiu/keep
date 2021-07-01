/**
 * @author mawei
 * @date 12/18/20
 * 实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * s = "We are happy."     "We%20are%20happy."
 */
public class ReplaceK {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceResult(s));
    }

    public static String replaceResult(String before) {
        String after = before.replaceAll(" ", "%20");
        return after;
    }
}
