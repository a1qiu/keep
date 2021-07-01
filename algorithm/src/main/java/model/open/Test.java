package model.open;

/**
 * @author mawei
 * @date 12/3/20
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new AsusComputer(4888.88D, "黑色", 8, 14.0F);
        System.out.println("电脑：华硕\n" +
                "售价：" + computer.getPrice() + "\n" +
                "颜色：" + computer.getColor() + "\n" +
                "内存：" + computer.getMemory() + "\n" +
                "尺寸：" + computer.getSize());
        System.out.println("················华丽的分界线··················");

        AsusDiscountComputer asusDiscountComputer = new AsusDiscountComputer(4888.88D, "深蓝", 8, 14.0F, 0.5F);
        System.out.println("电脑：华硕\n" +
                "原价：" + asusDiscountComputer.getPrice() + "\n" +
                "售价：" + asusDiscountComputer.getDiscountPrice() + "\n" +
                "颜色：" + asusDiscountComputer.getColor() + "\n" +
                "内存：" + asusDiscountComputer.getMemory() + "\n" +
                "尺寸：" + asusDiscountComputer.getSize());
    }
}