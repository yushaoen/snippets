import concepts.heap.Heap;
import concepts.heap.MaxHeap;
import concepts.heap.MinHeap;

/**
 * @author yushaoen
 */
public class MedianFinder<T extends Comparable<T>> {
    private Heap<T> minHeap;
    private Heap<T> maxHeap;

    public MedianFinder() {
        minHeap = new MinHeap<>();
        maxHeap = new MaxHeap<>();
    }

    public void add(T element) {
        // If both heaps are empty
        if (minHeap.size() == 0 && maxHeap.size() == 0) {
            maxHeap.add(element);
        }
        // If element is bigger than the smallest element of the bigger half
        else if (maxHeap.size() > 0 && element.compareTo(maxHeap.peek()) <=0 ) {
            maxHeap.add(element);
        }
        // If element is smaller than the biggest element of the smaller half
        else if (minHeap.size() > 0 && element.compareTo(minHeap.peek()) >= 0) {
            minHeap.add(element);
        }
        // Else, element is in between
        else {
            // If maxHeap has more elements
            if (maxHeap.size() >= minHeap.size()) {
                minHeap.add(element);
            } else {
                maxHeap.add(element);
            }
        }

        adjustHeaps();
    }

    private void adjustHeaps() {
        if (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
            Heap<T> smaller = (maxHeap.size() > minHeap.size()) ? minHeap : maxHeap;
            Heap<T> bigger  = (maxHeap.size() > minHeap.size()) ? maxHeap : minHeap;

            smaller.add(bigger.remove());
        }
    }

    public T getMedian() {
        Heap<T> bigger  = (maxHeap.size() > minHeap.size()) ? maxHeap : minHeap;
        return bigger.peek();
    }
}
