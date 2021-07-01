package aqs;

/**
 * @author mawei
 * @date 12/25/20
 */
public class SendSms extends SendCustom {
    @Override
    void to() {
        System.out.println("mutou");
    }

    @Override
    void from() {
        System.out.println("mawei");
    }


    @Override
    void send() {
        System.out.println("merry");
    }

    public static void main(String[] args) {
        SendCustom sendCustom = new SendSms();
        sendCustom.sendMessage();
    }
}
