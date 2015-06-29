package concepts.linkedlist;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class LinkedListReverserTest extends TestCase {

    public void testReverse() throws Exception {

        Node root, node;

        /**
         * Null case
         */
        assertTrue(LinkedListReverser.reverse(null) == null);

        /**
         * 1-Node case
         */
        root = new Node<Integer>(1, null);

        node = LinkedListReverser.reverse(root);

        assertEquals(1, node.data);
        node = node.next;
        assertTrue(node == null);

        /**
         * Multi-Node case
         */
        root = new Node<Integer>(1,
                                 new Node<Integer>(2,
                                                   new Node<Integer>(3,
                                                                     new Node<Integer>(4,
                                                                                       null))));
        node = LinkedListReverser.reverse(root);
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