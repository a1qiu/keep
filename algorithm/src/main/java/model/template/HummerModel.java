package model.template;

/**
 * @author mawei
 * @date 12/4/20
 */
public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        this.start();
        this.engineBoom();
        //  this.alarm();

        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    //增加一个钩子方法判断是否鸣笛
    protected boolean isAlarm() {
        return true;
    }

}
