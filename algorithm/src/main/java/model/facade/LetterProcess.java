package model.facade;

/**
 * @author mawei
 * @date 12/3/20
 */
public interface LetterProcess {
    public void writeContext(String context);

    public void fillEnvelop(String address);

    public void letterIntoEnvelope();

    public void sendLetter();
}
