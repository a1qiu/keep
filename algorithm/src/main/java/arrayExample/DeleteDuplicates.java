package arrayExample;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * 输入：1->2->3->3->4->4->5
 * 输出: 1->2->5
 */
public class DeleteDuplicates {
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.value == head.next.value) {
            while (head != null && head.next != null && head.value == head.next.value) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }

    }

    @Test
    public void t() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        ListNode temp = deleteDuplicates(head);
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

    }

    @Test
    public void testArr() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add("3");
        System.out.println(arrayList.size());
    }


}
