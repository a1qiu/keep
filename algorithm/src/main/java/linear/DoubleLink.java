package linear;

/**
 * 注： 双向链表是线性表之一，由n 个相同类型的元素组成 java 自带的双向链表 java.util.LinkList
 *
 * @author mawei
 * @date 6/25/21
 */
public class DoubleLink<T> {

    //头节点
    private Node<T> head;
    //节点个数
    private int conut;

    //双向链表对应的结构体
    private class Node<T> {
        private Node prev;
        private Node next;
        private T value;

        public Node(T value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    //构造函数
    public DoubleLink() {
        head = new Node<>(null, null, null);
        head.prev = head.next = head;
        conut = 0;
    }

    //返回节点数目
    public int size() {
        return conut;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return conut == 0;
    }

    //获取index 位置的节点
    private Node<T> getNode(int index) {
        Node<T> node;
        if (index < 0 || index > conut) {
            throw new IndexOutOfBoundsException();
        }
        //正向查找
        if (index <= conut / 2) {
            node = head.next;
            for (int i = 0; i < index; i++) {
                node = node.next;
                return node;
            }
        }
        //反向查找
        node = head.prev;
        int rindex = conut - index - 1;
        for (int i = 0; i < rindex; i++) {
            node = node.prev;
            return node;
        }
        return node;
    }
    //封装获取index 位置节点

    public T get(int index) {
        return getNode(index).value;
    }

    //获取第一个节点的值
    public T getFirst(int index) {
        return getNode(0).value;
    }

    //获取最后一个节点的值
    public T getLast(int index) {
        return getNode(conut - 1).value;
    }

    //将节点插入第index 位置之前
    public void insert(int index, T val) {
        if (index == 0) {
            Node<T> node = new Node<T>(val, head, head.next);
            head.next.prev = node;
            head.next = node;
            conut++;
            return;
        }

        Node<T> inode = getNode(index);
        Node<T> tnode = new Node<T>(val, inode.prev, inode);
        inode.prev.next = tnode;
        inode.next = tnode;
        conut++;
        return;

    }

    public void insertFirst(T t) {
        insert(0, t);
    }

    public void appendLast(T t) {
        Node node = new Node(t, head.prev, head);
        head.prev.next = node;
        head.prev = node;
        conut++;
    }

    //删除index 位置的节点
    public void del(int index) {
        Node<T> inode = getNode(index);
        inode.prev.next = inode.next;
        inode.next.prev = inode.prev;
        conut--;
    }

    //删除第一个节点
    public void delFirst() {
        del(0);
    }

    //删除最后一个节点
    public void delLast() {
        del(conut - 1);
    }
}
