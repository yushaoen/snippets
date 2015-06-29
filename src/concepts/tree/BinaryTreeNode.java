package concepts.tree;

/**
 * @author yushaoen
 */
public class BinaryTreeNode<T> {
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;
    private final T data;

    public BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.data = data;
        this.leftNode = left;
        this.rightNode = right;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }
}
