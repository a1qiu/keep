package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 */
public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        try {
            if (!humanEnum.getValue().equals("")) {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return human;
    }

}
