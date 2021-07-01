package model.facade;

/**
 * @author mawei
 * @date 12/3/20
 */
public class Client02 {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String context = "i miss you mutou~~";
        String address = "home~~~";
        modenPostOffice.sendLetter(context, address);
    }
}
