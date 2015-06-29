package concepts.tree;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class BinaryTreeRotatorTest extends TestCase {

    public void testRotateLeft() throws Exception {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, new BinaryTreeNode<>(2, new BinaryTreeNode<>(3, null, null),
                                                                                    new BinaryTreeNode<>(4, null, null)),
                                                            new BinaryTreeNode<>(5, null, null));

        BinaryTreeNode<Integer> newTree = BinaryTreeRotator.rotateLeft(root);
        assertEquals((Integer) 2, newTree.getData());
        assertEquals((Integer) 3, newTree.getLeftNode().getData());
        assertTrue(newTree.getLeftNode().getLeftNode() == null);
        assertTrue(newTree.getLeftNode().getRightNode() == null);
        assertEquals((Integer) 1, newTree.getRightNode().getData());
        assertEquals((Integer) 4, newTree.getRightNode().getLeftNode().getData());
        assertEquals((Integer) 5, newTree.getRightNode().getRightNode().getData());

        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(1, new BinaryTreeNode<>(2, new BinaryTreeNode<>(3, null, null),
                                                                                     null),
                                                             null);

        BinaryTreeNode<Integer> newTree1 = BinaryTreeRotator.rotateLeft(root1);
        assertEquals((Integer)2, newTree1.getData());
        assertEquals((Integer)3, newTree1.getLeftNode().getData());
        assertEquals((Integer)1, newTree1.getRightNode().getData());

        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(1, null, new BinaryTreeNode<>(2, null, new BinaryTreeNode<>(3, null, null)));

        try {
            BinaryTreeNode<Integer> newTree2 = BinaryTreeRotator.rotateLeft(root2);
            // should not reach here
            assertTrue(false);
        }
        catch(Exception e) {
            /* No-op */
        }
    }

    public void testRotateRight() throws Exception {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1, new BinaryTreeNode<>(2, new BinaryTreeNode<>(3, null, null),
                                                                                    new BinaryTreeNode<>(4, null, null)),
                                                            new BinaryTreeNode<>(5, null, null));

        BinaryTreeNode<Integer> newTree = BinaryTreeRotator.rotateRight(root);
        assertEquals((Integer) 5, newTree.getData());
        assertEquals((Integer) 1, newTree.getLeftNode().getData());
        assertEquals((Integer) 2, newTree.getLeftNode().getLeftNode().getData());
        assertEquals((Integer) 3, newTree.getLeftNode().getLeftNode().getLeftNode().getData());
        assertEquals((Integer) 4, newTree.getLeftNode().getLeftNode().getRightNode().getData());

        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<>(1, new BinaryTreeNode<>(2, new BinaryTreeNode<>(3, null, null),
                                                                                     null),
                                                             null);

        try {
        BinaryTreeNode<Integer> newTree1 = BinaryTreeRotator.rotateRight(root1);
            // should not reach here
            assertTrue(false);
        }
        catch(Exception e) {
            /* No-op */
        }

        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(1, null, new BinaryTreeNode<>(2, null, new BinaryTreeNode<>(3, null, null)));

        BinaryTreeNode<Integer> newTree2 = BinaryTreeRotator.rotateRight(root2);
        assertEquals((Integer)2, newTree2.getData());
        assertEquals((Integer)1, newTree2.getLeftNode().getData());
        assertEquals((Integer)3, newTree2.getRightNode().getData());
    }
}