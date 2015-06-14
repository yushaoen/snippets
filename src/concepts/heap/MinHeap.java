package concepts.heap;

/**
 * @author yushaoen
 */
public class MinHeap<T extends Comparable<T>> extends Heap<T> {
    public MinHeap() {
        super(Comparable::compareTo);
    }
}
