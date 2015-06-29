package concepts.string;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class AtofTest extends TestCase {

    public void testExecute() throws Exception {
        assertEquals(1234.0, Atof.execute("1234"));
        assertEquals(1234.0, Atof.execute("  1234   "));
        assertEquals(-1234.0, Atof.execute("-1234"));
        assertEquals(12.34, Atof.execute("12.34"));
        assertEquals(-12.34, Atof.execute("-12.34"));
        assertEquals(0.0, Atof.execute(""));
        assertEquals(-0.0, Atof.execute("-"));
        assertEquals(-0.0, Atof.execute("-0"));
        assertEquals(-1.0, Atof.execute("-1"));
        assertEquals(0.0, Atof.execute(null));

        try {
            Atof.execute("12.23.34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }

        try {
            Atof.execute("12-34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }

        try {
            Atof.execute("1 34");

            assertFalse(true);
        }
        catch(Exception e) {
            /* No-op */
        }
    }
}