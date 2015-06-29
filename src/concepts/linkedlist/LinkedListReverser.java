package concepts.linkedlist;

/**
 * @author yushaoen
 */
public class LinkedListReverser {
    private LinkedListReverser() {}

    public static Node reverse(Node root) {
        Node head = root;
        Node prev = null;
        Node node = root;
        Node next;

        while(node != null) {
            next = node.next;
            node.next = prev;
            if(next == null) {
                head = node;
                break;
            }
            else {
                prev = node;
                node = next;
            }
        }

        return head;
    }
}
