import concepts.tree.BinaryTreeNode;
import concepts.printer.ArrayPrinter;
import concepts.printer.SystemPrinter;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author yushaoen
 */
public class BinaryTreePrinterTest extends TestCase {

    private ArrayPrinter printer;

    public void setUp() throws Exception {
        super.setUp();
        printer = new ArrayPrinter();
    }

    /**
     * Test the following scenario:
     *
     *      1
     *     / \
     *    2   3
     *   / \   \
     *  4  5   6
     *    /
     *   7
     */
    @Test
    public void test() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1,
                                                        new BinaryTreeNode<>(2,
                                                                             new BinaryTreeNode<>(4,
                                                                                                  null,
                                                                                                  null),
                                                                             new BinaryTreeNode<>(5,
                                                                                                  new BinaryTreeNode<>(7,
                                                                                                                       null,
                                                                                                                       null),
                                                                                                  null)),
                                                        new BinaryTreeNode<>(3,
                                                                             new BinaryTreeNode<>(6, null, null),
                                                                             null)
        );

        BinaryTreePrinter.printByLevel(root, printer);
        assertEquals(5, printer.getLines());
        assertEquals(1, printer.getLine(0).size());
        assertEquals(2, printer.getLine(1).size());
        assertEquals(3, printer.getLine(2).size());
        assertEquals(1, printer.getLine(3).size());
        assertEquals(0, printer.getLine(4).size());

        // Using SystemPrinter should not throw any exception
        BinaryTreePrinter.printByLevel(root, new SystemPrinter());
    }

    @Test
    public void testEmptyNode() {
        BinaryTreePrinter.printByLevel(null, printer);
    }
}