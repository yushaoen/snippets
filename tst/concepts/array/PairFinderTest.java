package concepts.array;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author yushaoen
 */
public class PairFinderTest extends TestCase {

    public void testFind() throws Exception {
        PairFinder finder = new PairFinder(Arrays.asList(3, 4, 2, 5, 1));
        assertEquals(-1, finder.find(0, 5));
        assertEquals(4, finder.find(1, 5));
        assertEquals(3, finder.find(2, 5));
        assertEquals(2, finder.find(3, 5));
        assertEquals(1, finder.find(4, 5));
        assertEquals(-1, finder.find(5, 5));
        assertEquals(-1, finder.find(6, 5));
    }
}