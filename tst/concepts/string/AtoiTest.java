package concepts.string;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class AtoiTest extends TestCase {

    public void testExecute() throws Exception {
        assertEquals(1234, Atoi.execute("1234"));
        assertEquals(1234, Atoi.execute("  1234   "));
        assertEquals(-1234, Atoi.execute("-1234"));
        assertEquals(12, Atoi.execute("12.34"));
        assertEquals(-12, Atoi.execute("-12.34"));
        assertEquals(0, Atoi.execute(""));
        assertEquals(0, Atoi.execute("-"));
        assertEquals(0, Atoi.execute("-0"));
        assertEquals(-1, Atoi.execute("-1"));
        assertEquals(0, Atoi.execute(null));

        assertEquals(12, Atoi.execute("12.34"));

        try {
            Atoi.execute("12.23.34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }

        try {
            Atoi.execute("12-34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }

        try {
            Atoi.execute("1 34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }
    }
}