package model.factory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class HumanFactory {
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;

    }
}
