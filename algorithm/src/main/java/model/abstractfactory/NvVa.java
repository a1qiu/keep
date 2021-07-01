package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 */
public class NvVa {
    public static void main(String[] args) {
        HumanFactory femaleFactory = new FemaleHumanFactory();
        Human femaleYelloHuman = femaleFactory.createYelloHuman();
        femaleYelloHuman.laugh();
    }
}
