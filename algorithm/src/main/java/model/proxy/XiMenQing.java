package model.proxy;

/**
 * @author mawei
 * @date 12/2/20
 * 代理模式主要是用java 多态，干活的是被代理类，代理类主要是接活，然后交由幕后的类去做。因为代理类和被代理类都是同一个接口，知道能做啥不能做啥
 */
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.makeEyesWithMan();
        WangPo wangPo1 = new WangPo(new JiaShi());
        wangPo1.happyWithMan();
    }


}
