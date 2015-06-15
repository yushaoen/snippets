package concepts.string;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by yushaoen on 6/7/2015.
 */
public class AnagramFinderTest extends TestCase {
    @Test
    public void test() {
        List<String> testList = Arrays.asList(
                "abc",
                "bbb",
                "bca",
                "cba",
                "abcd",
                "cbad",
                "dcab",
                "bbb",
                "aaa");

        AnagramFinder finder = new AnagramFinder();

        finder.add(testList);
        finder.add("bdca");

        Map<String, Set<String>> result = finder.group();
        assertEquals(4, result.size());
        assertEquals(3, result.get("abc").size());
        assertEquals(4, result.get("abcd").size());
        assertEquals(1, result.get("aaa").size());
        assertEquals(1, result.get("bbb").size());
    }
}
