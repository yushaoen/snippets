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

        AnagramFinder finder = new AnagramFinder(testList);
        Map<String, Set<String>> result = finder.group();
    }
}
