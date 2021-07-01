package model.multition;

/**
 * @author mawei
 * @date 12/2/20
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        int minsterNum = 10;
        for (int i = 0; i <minsterNum ; i++) {
            Emperor emperor=Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是:");
            emperor.emperorInfo();
        }
    }
}
