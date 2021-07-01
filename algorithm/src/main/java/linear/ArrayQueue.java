package linear;

/**
 * @author mawei
 * @date 6/30/21
 * linkList 深度
 * 并且通过栈实现队列
 */
public class ArrayQueue {
    private int[] array;
    private int count;

    //构造函数
    public ArrayQueue(int sz) {
        array = new int[sz];
        count = 0;

    }

    //入队
    public void add(int val) {
        array[count++] = val;
    }

    //返回队列开头元素
    public int front() {
        return array[0];
    }

    // 返回“队头元素值”，并删除“队头元素”
    public int pop() {
        int val = array[0];
        count--;
        for (int i = 1; i <= count; i++)
            array[i - 1] = array[i];
        return val;
    }

    //返回队列长度
    public int size() {
        return count;
    }

    //队列是否为空
    public boolean isEmpty() {
        return size() == 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int tmp = 0;
        ArrayQueue queue = new ArrayQueue(12);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("初始队列如下");
        queue.print();

        System.out.println("头节点" + queue.front());
        queue.add(tmp);
        queue.print();
        System.out.println("弹出元素");
        queue.pop();
        queue.print();
    }
}

