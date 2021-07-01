import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    //返回最大值，此时返回的是depue 的第一个元素
    public int max_value() {
        if (deque.isEmpty()) {
            return -1;
        }
        int max = deque.getFirst();
        return max;
    }

    public void push_back(int value) {
        //普通队列直接入队
        queue.offer(value);
        //双端队列需要现将小于改值的value出队
        while (!deque.isEmpty() && deque.getLast() < value) {
            deque.removeLast();
        }
        deque.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        //普通队列出队
        int temp = queue.poll();
        if (temp == deque.peekFirst()) {
            return deque.pollFirst();
        } else {
            return temp;
        }
    }

}
