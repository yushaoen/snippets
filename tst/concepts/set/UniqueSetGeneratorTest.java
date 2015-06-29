package concepts.set;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yushaoen
 */
public class UniqueSetGeneratorTest extends TestCase {

    public void testUnion() throws Exception {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        b.add("1");
        b.add("2");
        b.add("3");
        b.add("7");
        b.add("8");

        Set<String> c = UniqueSetGenerator.union(a, b);

        System.out.println(c);

        Set<String> d = new HashSet<>();

        d.add("1");
        d.add("2");
        d.add("3");
        d.add("4");
        d.add("5");
        d.add("7");
        d.add("8");

        assertEquals(c, d);
    }
}