package concepts.selection;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class MedianFinderTest extends TestCase {

    private MedianFinder<Integer> finder;

    public void setUp() throws Exception {
        super.setUp();
        finder = new MedianFinder<>();
    }

    public void testGetMedian() throws Exception {
        finder.add(50);
        assertEquals(50, (int)finder.getMedian());
        finder.add(75);
        finder.add(25);
        assertEquals(50, (int)finder.getMedian());
        finder.add(100);
        finder.add(125);
        assertEquals(75, (int)finder.getMedian());
        finder.add(150);
        assertEquals(100, (int)finder.getMedian());
        finder.add(175);
        assertEquals(100, (int)finder.getMedian());
        finder.add(200);
        assertEquals(125, (int)finder.getMedian());
        finder.add(225);
        assertEquals(125, (int)finder.getMedian());
        finder.add(250);
        assertEquals(150, (int)finder.getMedian());
        finder.add(275);
    }
}