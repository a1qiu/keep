package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 */
public interface HumanFactory {
    public Human createYelloHuman();
    //制造一个白色人类
    public Human createWhiteHuman();
    //制造一个黑色人类
    public Human createBlackHuman();
}
