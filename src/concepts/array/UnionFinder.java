package concepts.array;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author yushaoen
 */
public class UnionFinder {
    private UnionFinder() {
    }

    public static Set<Integer> union(List<Integer> list1, List<Integer> list2) {
        if (list1 == null && list2 == null) {
            return new HashSet<>();
        }
        else if (list1 == null) {
            return new HashSet<>(list2);
        }
        else if (list2 == null) {
            return new HashSet<>(list1);
        }

        Set<Integer> result = new HashSet<>();

        execute(list1, list2, result, result);

        return result;
    }

    public static Set<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            return new HashSet<>();
        }

        Set<Integer> result = new HashSet<>();

        execute(list1, list2, result, null);

        return result;
    }

    private static void execute(List<Integer> list1,
                                List<Integer> list2,
                                Set<Integer> equalCase,
                                Set<Integer> notEqualCase) {

        Collections.sort(list1);
        Collections.sort(list2);

        int index1 = 0, index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            int number1 = list1.get(index1);
            int number2 = list2.get(index2);

            if (number1 == number2) {
                if (equalCase != null) {
                    equalCase.add(number1);
                }

                index1++;
                index2++;
            }
            else if (number1 < number2) {
                if (notEqualCase != null) {
                    notEqualCase.add(number1);
                }

                index1++;
            }
            else {
                if (notEqualCase != null) {
                    notEqualCase.add(number2);
                }

                index2++;
            }
        }

        if (notEqualCase != null) {
            int index = (index1 == list1.size()) ? index2 : index1;
            List<Integer> list = (index1 == list1.size()) ? list2 : list1;
            while (index < list.size()) {
                notEqualCase.add(list.get(index));
                index++;
            }
        }
    }
}
