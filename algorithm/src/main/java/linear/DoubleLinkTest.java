package linear;

/**
 * @author mawei
 * @date 6/28/21
 */
public class DoubleLinkTest {
    public static void main(String[] args) {
        int[] iarr = {10, 20, 30, 40};
        DoubleLink<Integer> dlink = new DoubleLink<Integer>();
        dlink.insert(0, 20);
        dlink.appendLast(10);
        dlink.insertFirst(30);
        System.out.printf("isEmpty()=%b", dlink.isEmpty());
        System.out.printf("size()=%d\n", dlink.size());
        //打印全部节点
        for (int i = 0; i < dlink.size(); i++) {
            System.out.println("dlink(" + i + ")" + dlink.get(i));
        }
    }
}
