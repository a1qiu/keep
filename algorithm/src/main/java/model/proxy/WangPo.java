package model.proxy;

/**
 * @author mawei
 * @date 12/2/20
 * 作为代理
 */
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    // 默认的话是潘金莲的代理
    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    //她可以是kindwomen 的任何一个女人的代理只要你是这一类型
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
