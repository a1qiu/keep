package model.bridge;

/**
 * @author mawei
 * @date 12/21/20
 */
public abstract class Crop {

    private Product product;

    public Crop(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProduct();
        this.product.beSelled();

    }
}
