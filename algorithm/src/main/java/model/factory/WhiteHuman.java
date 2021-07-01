package model.factory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class WhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("白种人会说话");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }
}
