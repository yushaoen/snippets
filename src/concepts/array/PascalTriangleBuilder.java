package concepts.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yushaoen
 */
public class PascalTriangleBuilder {
    private PascalTriangleBuilder() {
    }

    public static List<List<Integer>> build(int level) {
        List<List<Integer>> result = new ArrayList<>();

        if (level > 0) {
            result.add(Arrays.asList(1));

            for (int i = 1; i < level; i++) {
                result.add(createNextLevel(result.get(i - 1)));
            }
        }

        return result;
    }

    private static List<Integer> createNextLevel(List<Integer> prevLevel) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= prevLevel.size(); i++) {
            int prevLeft = (i == 0) ? 0 : prevLevel.get(i - 1);
            int prevRight = (i == prevLevel.size()) ? 0 : prevLevel.get(i);

            result.add(prevLeft + prevRight);
        }

        return result;
    }
}
