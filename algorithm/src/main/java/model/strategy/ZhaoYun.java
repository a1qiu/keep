package model.strategy;

/**
 * @author mawei
 * @date 12/2/20
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("-----------刚到吴国拆第一个-----------");
        context = new Context(new BackDoor());
        context.operate();


        System.out.println("-----------刘备乐不思蜀拆第二个---------");
        context = new Context(new GivenGreenLight());
        context.operate();


        System.out.println("--------孙权追兵拆第三个--------");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
