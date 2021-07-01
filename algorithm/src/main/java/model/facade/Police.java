package model.facade;

import javax.annotation.Resource;

/**
 * @author mawei
 * @date 12/3/20
 */
public class Police {
    @Resource
    private LetterProcess letterProcess;

    public void check(LetterProcess letterProcess) {
        System.out.println("-----信件例行检查-------");
    }
}
