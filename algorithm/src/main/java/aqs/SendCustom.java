package aqs;

import java.util.Date;

/**
 * @author mawei
 * @date 12/25/20
 * 一个抽象类公开定义了执行他的方法的方式/模板 它的子类可以按需重写方法实现 但调用将以抽象类中定义的方式执行 这种类型的设计模式属于行为模式
 */
public abstract class SendCustom {
    abstract void to();

    abstract void from();

    void date() {
        System.out.println(new Date());
    }

    abstract void send();
    //模板方法
    void sendMessage() {
        to();
        from();
        date();
        send();
    }
}
