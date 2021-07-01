package model.open;

/**
 * @author mawei
 * @date 12/3/20
 */
public class AsusDiscountComputer extends AsusComputer {
    private float discount;

    public AsusDiscountComputer(double price, String color, int memory, float size, float discount) {
        super(price, color, memory, size);
        this.discount = discount;
    }

    public double getDiscountPrice() {
        return getPrice() * this.discount;
    }
}
