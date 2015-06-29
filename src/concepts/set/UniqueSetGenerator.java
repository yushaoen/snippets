package concepts.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yushaoen
 */
public final class UniqueSetGenerator {
    /**
     * Avoid this to be constructed or inherited.
     */
    private UniqueSetGenerator() {
    }

    public static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> c = new HashSet<>();

        for(String e : a) {
            if (!c.contains(e)) {
                c.add(e);
            }
        }

        for(String e : b) {
            if (!c.contains(e)) {
                c.add(e);
            }
        }

        return c;
    }
}
