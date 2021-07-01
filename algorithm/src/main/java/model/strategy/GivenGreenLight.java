package model.strategy;

/**
 * @author mawei
 * @date 12/2/20
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!");
    }
}
