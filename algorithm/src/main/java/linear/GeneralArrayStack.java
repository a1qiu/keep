package linear;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Stack;

/**
 * @author mawei
 * @date 6/28/21
 * collection集合中的stack
 */
public class GeneralArrayStack<T> {
    private static final int DEFAULT_SIZE = 12;
    private T[] array;
    private int count;

    public GeneralArrayStack(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }

    public GeneralArrayStack(Class<T> type, int size) {
        array = (T[]) Array.newInstance(type, size);
        count = 0;
    }

    //将val 添加到栈中
    public void push(T val) {
        array[count++] = val;
    }

    //返回栈顶元素值
    public T peek() {
        return array[count - 1];
    }

    //弹出栈顶元素
    public T pop() {
        T re = array[count - 1];
        count--;
        return re;
    }

    //返回栈大小
    public int size() {
        return count;
    }

    //返回栈是否为空
    public boolean isEmpty() {
        return size() == 0;
    }

    //打印栈
    public void printStack() {
        if (isEmpty()) {
            System.out.println("不好意思栈为空");
        }
        while (count > 0) {
            System.out.println(array[count - 1]);
            count--;
        }
    }

    public static void main(String[] args) {
        GeneralArrayStack<String> stack = new GeneralArrayStack<String>(String.class);
        stack.push("xixi");
        stack.push("haha");
        stack.push("heihei");

        System.out.printf("栈顶元素%s", stack.peek());
        System.out.printf("删除的栈顶元素为%s", stack.pop());
        stack.push("just");
        System.out.println("开始打印元素");
        stack.printStack();

    }
    @Test
    public void javaStack(){
        Stack<Integer> astack = new Stack<Integer>();
    }
}
