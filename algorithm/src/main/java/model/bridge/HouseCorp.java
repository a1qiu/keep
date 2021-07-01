package model.bridge;

/**
 * @author mawei
 * @date 12/21/20
 */
public class HouseCorp extends Crop {
    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了..");
    }
}
