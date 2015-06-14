package concepts.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author yushaoen
 */
public class Heap<T extends Comparable> extends PriorityQueue<T> {
    public Heap(Comparator<T> comparator) {
        super(comparator);
    }
}
