package listExample;

/**
 * @author mawei
 * @date 11/13/20
 * <p>
 * <p>
 * {1 -> 2 -> 3 -> 4 -> 5 -> NULL，需要返回 3 这个 ListNode；
 * 1234
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL，需要返回 4 这个 ListNode。}
 */

public class middleNode {
    public static Node getMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node temp = getMiddleNode(head);
        System.out.println(temp.value);
    }
}
