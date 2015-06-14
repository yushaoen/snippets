package concepts.printer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yushaoen
 */
public class ArrayPrinter implements IPrinter {
    private int lines;
    private List<List> listOfLists;

    public ArrayPrinter() {
        lines = 0;
        listOfLists = new ArrayList<>();
    }

    public void print(Object data) {
        if (lines == 0) {
            listOfLists.add(new ArrayList<>());
            lines++;
        }

        listOfLists.get(lines - 1).add(data);
    }

    public void printNewLine() {
        listOfLists.add(new ArrayList<>());
        lines++;
    }

    public int getLines() {
        return lines;
    }

    public List getLine(int line) {
        return listOfLists.get(line);
    }
}
