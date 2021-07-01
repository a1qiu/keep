package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class FemaleHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createYelloHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
