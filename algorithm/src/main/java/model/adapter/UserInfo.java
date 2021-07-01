package model.adapter;

/**
 * @author mawei
 * @date 12/3/20
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址....");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工的家庭电话是....");
        return null;
    }

    @Override
    public String getOfficeTelNum() {
        System.out.println("员工的getOfficeTelNum...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("getJobPosition...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("getHomeTelNumber");
        return null;
    }
}
