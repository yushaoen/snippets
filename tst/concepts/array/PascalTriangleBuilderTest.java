package concepts.array;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author yushaoen
 */
public class PascalTriangleBuilderTest extends TestCase {

    public void testBuild() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList(1)),
                     PascalTriangleBuilder.build(1));

        assertEquals(Arrays.asList(Arrays.asList(1),
                                   Arrays.asList(1, 1)),
                     PascalTriangleBuilder.build(2));

        assertEquals(Arrays.asList(Arrays.asList(1),
                                   Arrays.asList(1, 1),
                                   Arrays.asList(1, 2, 1)),
                     PascalTriangleBuilder.build(3));

        assertEquals(Arrays.asList(Arrays.asList(1),
                                   Arrays.asList(1, 1),
                                   Arrays.asList(1, 2, 1),
                                   Arrays.asList(1, 3, 3, 1)),
                     PascalTriangleBuilder.build(4));
    }
}