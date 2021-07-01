package model.facade;

/**
 * @author mawei
 * @date 12/3/20
 * 如果需要对信件进行检查。做切面即可
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProccessImpl();
    private Police police = new Police();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelop(address);
        police.check(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
