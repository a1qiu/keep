package model.bridge;

/**
 * @author mawei
 * @date 12/21/20
 */
public class ShanZhaiCorp extends Crop {
    public ShanZhaiCorp(IPod iPod) {
        super(iPod);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
