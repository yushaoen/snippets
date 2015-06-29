package concepts.tree;

/**
 * @author yushaoen
 */
public class BinaryTreeRotator {
    private BinaryTreeRotator() {
    }

    public static BinaryTreeNode<Integer> rotateLeft(BinaryTreeNode<Integer> root) throws Exception {
        BinaryTreeNode<Integer> left = root.getLeftNode();

        if (left == null) {
            throw new Exception("Cannot rotate a tree left with a left node");
        }

        root.setLeftNode(left.getRightNode());
        left.setRightNode(root);
        return left;
    }

    public static BinaryTreeNode<Integer> rotateRight(BinaryTreeNode<Integer> root) throws Exception {
        BinaryTreeNode<Integer> right = root.getRightNode();

        if (right == null) {
            throw new Exception("Cannot rotate a tree right with a right node");
        }

        root.setRightNode(right.getLeftNode());
        right.setLeftNode(root);
        return right;
    }
}
