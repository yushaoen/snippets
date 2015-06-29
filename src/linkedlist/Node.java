package linkedlist;

/**
 * @author yushaoen
 */
public class Node<T> {
    public Node next;
    public final T data;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
