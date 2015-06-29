package concepts.linkedlist;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class LinkedListReverserTest extends TestCase {

    public void testReverse() throws Exception {
        Node root = new Node<Integer>(1,
                                      new Node<Integer>(2,
                                                        new Node<Integer>(3,
                                                                          new Node<Integer>(4,
                                                                                            null))));
        Node node = LinkedListReverser.reverse(root);
        assertEquals(4, node.data);
        node = node.next;
        assertEquals(3, node.data);
        node = node.next;
        assertEquals(2, node.data);
        node = node.next;
        assertEquals(1, node.data);
        node = node.next;
        assertTrue(node == null);
    }
}