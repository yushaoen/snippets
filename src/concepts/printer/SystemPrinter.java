package concepts.printer;

/**
 * @author yushaoen
 */
public class SystemPrinter implements IPrinter {
    public void print(Object data) {
        System.out.print(data);
    }

    public void printNewLine() {
        System.out.println();
    }
}
