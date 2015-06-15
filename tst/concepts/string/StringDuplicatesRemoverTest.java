package concepts.string;

import junit.framework.TestCase;

/**
 * @author yushaoen
 */
public class StringDuplicatesRemoverTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testPrune() throws Exception {
        String testString = "here comes here dog we are here are aha";
        char testStringArray[] = testString.toCharArray();
        int length = StringDuplicatesRemover.prune(testStringArray);

        char resultString[] = new char[length];

        System.arraycopy(testStringArray, 0, resultString, 0, length);

        assertEquals("here comes dog we are aha", new String(resultString));
    }

    public void testPruneNoDuplicates() throws Exception {
        String testString = "here comes the dog";
        char testStringArray[] = testString.toCharArray();
        int length = StringDuplicatesRemover.prune(testStringArray);

        char resultString[] = new char[length];

        System.arraycopy(testStringArray, 0, resultString, 0, length);

        assertEquals("here comes the dog", new String(resultString));
    }

    public void testPruneEmptyString() throws Exception {
        String testString = "";
        char testStringArray[] = testString.toCharArray();
        int length = StringDuplicatesRemover.prune(testStringArray);

        char resultString[] = new char[length];

        System.arraycopy(testStringArray, 0, resultString, 0, length);

        assertEquals("", new String(resultString));
    }

    public void testPrune1Char() throws Exception {
        String testString = "a";
        char testStringArray[] = testString.toCharArray();
        int length = StringDuplicatesRemover.prune(testStringArray);

        char resultString[] = new char[length];

        System.arraycopy(testStringArray, 0, resultString, 0, length);

        assertEquals("a", new String(resultString));
    }
}