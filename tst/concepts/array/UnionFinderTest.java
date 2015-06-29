package concepts.array;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yushaoen
 */
public class UnionFinderTest extends TestCase {

    public void testUnion() throws Exception {
        Set<Integer> answer = UnionFinder.union(Arrays.asList(3, 1, 5, 4),
                                                Arrays.asList(6, 2, 3, 4, 4));
        Set<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);

        assertEquals(expected, answer);
    }

    public void testUnion1() throws Exception {
        Set<Integer> answer = UnionFinder.union(null,
                                                Arrays.asList(6, 2, 3, 4));
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(6);

        assertEquals(expected, answer);
    }

    public void testUnion2() throws Exception {
        Set<Integer> answer = UnionFinder.union(Arrays.asList(6, 2, 3, 4),
                                                null);
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(6);

        assertEquals(expected, answer);
    }

    public void testUnion3() throws Exception {
        Set<Integer> answer = UnionFinder.union(null,
                                                null);
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, answer);
    }

    public void testUnion4() throws Exception {
        Set<Integer> answer = UnionFinder.union(Arrays.asList(6, 2, 3, 4),
                                                new ArrayList<>());
        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(6);

        assertEquals(expected, answer);
    }

    public void testIntersection() throws Exception {
        Set<Integer> answer = UnionFinder.intersection(Arrays.asList(3, 1, 5, 4),
                                                       Arrays.asList(6, 2, 3, 4, 4));
        Set<Integer> expected = new HashSet<>();
        expected.add(3);
        expected.add(4);

        assertEquals(expected, answer);
    }

    public void testIntersection1() throws Exception {
        Set<Integer> answer = UnionFinder.intersection(new ArrayList<>(),
                                                       Arrays.asList(6, 2, 3, 4, 4));
        Set<Integer> expected = new HashSet<>();

        assertEquals(expected, answer);
    }

    public void testIntersection2() throws Exception {
        assertEquals(new HashSet<>(), UnionFinder.intersection(null,
                                                               Arrays.asList(6, 2, 3, 4, 4)));
        assertEquals(new HashSet<>(), UnionFinder.intersection(Arrays.asList(6, 2, 3, 4, 4),
                                                               null));
        assertEquals(new HashSet<>(), UnionFinder.intersection(null,
                                                               null));
        assertEquals(new HashSet<>(), UnionFinder.intersection(Arrays.asList(6, 2, 3, 4, 4),
                                                               new ArrayList<>()));
    }
}