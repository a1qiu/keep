package listExample;

import lombok.Data;

/**
 * @author mawei
 * @date 11/13/20
 */

@Data
public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
