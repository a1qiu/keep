package model.factory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class YelloHuman implements Human {
    @Override
    public void cry() {
        System.out.println("黄种人会哭～～～～");
    }

    @Override
    public void laugh() {
        System.out.println("黄种人会笑～～～～～");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话～～～");
    }
}
