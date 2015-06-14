package concepts.heap;

/**
 * @author yushaoen
 */
public class MaxHeap<T extends Comparable<T>> extends Heap<T> {
    public MaxHeap() {
        super((x,y) -> -x.compareTo(y));
    }
}
