package model.bridge;

/**
 * @author mawei
 * @date 12/21/20
 */
public class House extends Product {
    @Override
    public void beProduct() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
