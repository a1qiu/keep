package tanxin;

import java.util.Arrays;

/**
 * @author mawei
 * @date 11/13/20
 * desc:对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
 * 如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 */
public class FindContentChildren {
    public static int findContentChildren(int[] chridArr, int[] cookieArr) {
        Arrays.sort(chridArr);
        Arrays.sort(chridArr);
        int chrid = 0, cookie = 0;
        while (chrid < chridArr.length && cookie < cookieArr.length) {
            if (chridArr[chrid] <= cookieArr[cookie]) {
                ++chrid;
            }
            ++cookie;

        }
        return chrid;
    }

    public static void main(String[] args) {
        String a="test";
        System.out.println(a.length());
        int[] c = {4, 5};
        int[] co = {1, 2, 3};
        // System.out.println(findContentChildren(c, co));
        System.arraycopy(c, 0, co, 0, 0);
        for (int s : co) {
            System.out.print(s + "");
        }
    }


}


