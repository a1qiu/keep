package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 * 其他的两个抽象类 AbstractWhiteHuman 和 AbstractgBlackHuman 与此类似的事项方法
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void cry() {
        System.out.println("抽象工厂之黄色人类会哭");
    }

    @Override
    public void laugh() {
        System.out.println("抽象工厂之黄色人类会笑");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类会交谈");
    }
}
