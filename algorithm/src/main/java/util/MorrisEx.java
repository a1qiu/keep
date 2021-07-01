package util;

/**
 * @author mawei
 * @date 6/9/21
 */
public class MorrisEx {
    public class Node {
        public int value;
        public Node right;
        public Node left;

        public Node(int value) {
            this.value = value;
        }
    }

    //morris 遍历
    public void morris(Node head) {

        if (head == null) {
            return;
        }
        Node cur = head;
        Node mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            //左子树不为空的情况
            if (mostRight != null) {
                //找到最右的节点
                while (mostRight.right != null && mostRight.right != cur)
                    mostRight = mostRight.right;

                if (mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else {
                    mostRight.right = null;
                }
            }
            cur = cur.right;
        }

    }
}
/**
 * dispatcherServlet 在服务启动阶段 会调用init 方法进行服务初始化，此阶段主要包括
 * 1.扫描指定包下所有的类信息，返回的结果主要是包名+类名
 * 2.通过反射机制，将类进行实例化，将类实例化对象存储到ioc 容器中其中key 是类名，value 是类对象
 * 3.前端发起一个请求时，dispatcherServlet 获取到请求路径之后，通过与requestMapping 中的路径进行匹配，找到对应的controller类中的方法，通过
 * invoke 完成方法的调用，将调用结果返回给前端
 */
