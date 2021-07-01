package model.bridge;

/**
 * @author mawei
 * @date 12/21/20
 */
public class IPod extends Product {
    @Override
    public void beProduct() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
