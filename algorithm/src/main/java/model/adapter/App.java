package model.adapter;

/**
 * @author mawei
 * @date 12/3/20
 * 适配器不适合在系统设计阶段采用，该模式主要适用拓展应用中，只有当不符合原有设计时才采用。
 */
public class App {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
//        for (int i = 0; i < 101; i++) {
//            youngGirl.getMobileNumber();
//        }


        IUserInfo young = new OuterUserInfo();
        young.getUserName();

    }
}
