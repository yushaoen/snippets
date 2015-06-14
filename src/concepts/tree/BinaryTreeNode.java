package concepts.tree;

/**
 * @author yushaoen
 */
public class BinaryTreeNode<T> {
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;
    private T data;

    public BinaryTreeNode(T data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.leftNode = left;
        this.rightNode = right;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public T getData() {
        return data;
    }
}
