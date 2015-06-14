import concepts.tree.BinaryTreeNode;
import concepts.printer.IPrinter;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yushaoen
 */
public class BinaryTreePrinter {

    public static void printByLevel(BinaryTreeNode root, IPrinter printer) {
        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int nodesInCurrentLvl = 0, nodesInNextLvl = 0;

        queue.add(root);
        nodesInCurrentLvl = 1;

        while(queue.size() > 0) {
            BinaryTreeNode node = queue.remove();

            printer.print(node.getData());

            nodesInCurrentLvl--;

            if (node.getLeftNode() != null) {
                queue.add(node.getLeftNode());
                nodesInNextLvl++;
            }

            if (node.getRightNode() != null) {
                queue.add(node.getRightNode());
                nodesInNextLvl++;
            }

            if (nodesInCurrentLvl == 0) {
                printer.printNewLine();
                nodesInCurrentLvl = nodesInNextLvl;
                nodesInNextLvl = 0;
            }
        }
    }
}
