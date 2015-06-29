package concepts.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author yushaoen
 */
public class PairFinder {
    private List<Integer> list;

    public PairFinder() {
        list = new ArrayList<>();
    }

    public PairFinder(List<Integer> list) {
        this.list = list;
        Collections.sort(this.list);
    }

    public int find(int target, int sum) {
        Integer[] array = (Integer[])list.toArray();

        int index = -1;

        if (Arrays.binarySearch(array, target) != -1) {
            index = Arrays.binarySearch(array, sum - target);
        }

        return (index != -1) ? array[index] : -1;
    }
}
