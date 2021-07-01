package model.template;

/**
 * @author mawei
 * @date 12/4/20
 */
@SuppressWarnings("all")
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;//是否鸣笛又用户决定


    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }


}
