import java.util.*;

/**
 * Given an array of strings, group them by anagrams. Ex: abc & cba should
 * be considered as in the same group.
 *
 * Usage:
 *
 * List<String> testList = Arrays.asList("abc", "ccc", "bca");
 * AnagramFinder finder = new AnagramFinder(testList);
 * Map<String, Set<String>> result = finder.group();
 *
 * Created by yushaoen on 6/7/2015.
 */
public class AnagramFinder {
    private final List<String> list;

    public AnagramFinder(List<String> list) {
        this.list = list;
    }

    /**
     * Add a new string for grouping by anagrams
     *
     * @param string    a new string to add for grouping
     */
    public void add(String string) {
        this.list.add(string);
    }

    /**
     * Execute to group the saved strings by anagrams.
     *
     * @return  a map of anagram groups keyed by the anagram signature
     *          each group contains all the strings with the same anagram
     */
    public Map<String, Set<String>> group() {

        Map<String, Set<String>> result = new HashMap<>();

        for(String s : this.list) {
            String signature = signature(s);

            if (!result.containsKey(signature)) {
                Set<String> set = new HashSet<>();
                set.add(s);
                result.put(signature, set);
            }
            else {
                result.get(signature).add(s);
            }
        }

        return result;
    }

    /**
     * Return the anagram of the given string
     * @param s {String}
     * @return  The anagram signature of the string
     */
    public String signature(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
