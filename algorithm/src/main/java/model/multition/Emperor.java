package model.multition;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author mawei
 * @date 12/2/20
 */
@SuppressWarnings("all")
public class Emperor {
    //做多只能两个皇帝
    private static int maxNumOfEmperor = 2;
    //装皇帝的列表
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor() {

    }

    private Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
