package model.facade;

/**
 * @author mawei
 * @date 12/3/20
 */
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProccessImpl();
        letterProcess.writeContext("hello mawei~~");
        letterProcess.fillEnvelop("happy road no1");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
