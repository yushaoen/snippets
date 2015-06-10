import java.util.*;

/**
 * Created by yushaoen on 6/7/2015.
 */
public class AnagramFinder {
    private final List<String> list;

    public AnagramFinder(List<String> list) {
        this.list = list;
    }

    public void add(String string) {
        this.list.add(string);
    }

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

    public String signature(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
