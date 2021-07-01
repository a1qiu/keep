package model.strategy;

/**
 * @author mawei
 * @date 12/2/20
 *锦囊
 */

public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        this.iStrategy.operate();
    }
}
