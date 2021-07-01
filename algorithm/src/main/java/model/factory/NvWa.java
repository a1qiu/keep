package model.factory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class NvWa {
    public static void main(String[] args) {
        Human human = HumanFactory.createHuman(YelloHuman.class);
        human.laugh();
    }
}
