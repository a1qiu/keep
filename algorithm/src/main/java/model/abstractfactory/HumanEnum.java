package model.abstractfactory;

/**
 * @author mawei
 * @date 12/2/20
 */
public enum HumanEnum {
    YellowFemaleHuman("model.abstractfactory.YellowFemaleHuman");
    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
