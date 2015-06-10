import junit.framework.TestCase;

/**
 * Created by yushaoen on 6/7/2015.
 */
public class StringRotatorTest extends TestCase {

    public void testRotateLeft() throws Exception {
        assertEquals("", StringRotator.rotateLeft("", 3));
        assertEquals("a", StringRotator.rotateLeft("a", 3));
        assertEquals("abcd", StringRotator.rotateLeft("abcd", 4));
        assertEquals("bcda", StringRotator.rotateLeft("abcd", 5));
        assertEquals("defabc", StringRotator.rotateLeft("abcdef", 3));
        assertEquals("cdefab", StringRotator.rotateLeft("abcdef", 2));
        assertEquals("bcdefa", StringRotator.rotateLeft("abcdef", 1));
    }

    public void testReverse() {
        String testString = StringRotator.reverse("abc");
        assertEquals("cba", testString);
        assertEquals("dcba", StringRotator.reverse("abcd"));
        assertEquals("", StringRotator.reverse(""));
    }

    public void testRotateRight() throws Exception {
        assertEquals("dabc", StringRotator.rotateRight("abcd", 1));
        assertEquals("cdab", StringRotator.rotateRight("abcd", 2));
        assertEquals("bcda", StringRotator.rotateRight("abcd", 3));
        assertEquals("abcd", StringRotator.rotateRight("abcd", 4));
        assertEquals("dabc", StringRotator.rotateRight("abcd", 5));
        assertEquals("cdab", StringRotator.rotateRight("abcd", 6));
        assertEquals("", StringRotator.rotateRight("", 2));
    }

    public void testRotate() throws Exception {

    }
}