package listExample;

/**
 * @author mawei
 * @date 11/13/20
 */
public class RemoveValue {
    public static Node removeValue(Node head, int val) {
        Node dummpty = new Node(0);
        Node pre = dummpty;
        Node cur = head;
        while (cur != null) {
            if (cur.value != val) {
                pre.next = cur;
                pre = pre.next;
            }
            cur = cur.next;
        }
        pre.next = null;
        return dummpty.next;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        Node tep = removeValue(node, 2);
        while (tep != null) {
            System.out.print(tep.value);
            tep = tep.next;
        }
    }
}
