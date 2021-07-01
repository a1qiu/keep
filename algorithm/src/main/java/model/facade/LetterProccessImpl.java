package model.facade;

/**
 * @author mawei
 * @date 12/3/20
 */
public class LetterProccessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    @Override
    public void fillEnvelop(String address) {
        System.out.println("填写收件人地址及姓名...." + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中....");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}
