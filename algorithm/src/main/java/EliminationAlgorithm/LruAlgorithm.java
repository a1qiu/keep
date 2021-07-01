package EliminationAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mawei
 * @date 12/17/20
 * 类比手机后台运行程序时的淘汰策略
 * LRU 缓存算法核心：LinkedHashMap
 */

public class LruAlgorithm {
    //定义数据结构
    class Node {
        int key, val;
        Node next, pre;

        Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    class DoubleList {
        //定义头节点，尾节点
        private Node head, tail;
        //元素个数
        private int size;

        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            size = 0;
            head.next = tail;
            tail.pre = head;
        }

        public void addLast(Node x) {
            x.pre = tail.pre;
            x.next = tail;
            tail.pre.next = x;
            tail.pre = x;
            size++;
        }

        public void remove(Node x) {
            x.pre.next = x.next;
            x.next.pre = x.pre;
            size--;
        }

        public Node removeFirst() {
            if (head.next == tail) {
                return null;
            }
            Node first = head.next;
            remove(first);
            return first;

        }

        public int size() {
            return size;
        }

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List<String> synchronizedList = Collections.synchronizedList(list);
        synchronizedList.add("add");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();


    }
}
