package concepts.string;

import org.apache.commons.lang.StringUtils;

/**
 * @author yushaoen
 */
public class Atoi {
    private Atoi() {

    }

    public static int execute(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        if (StringUtils.countMatches(input, ".") > 1) {
            throw new IllegalArgumentException("input contains more than 1 dot");
        }

        char[] chars = StringUtils.trim(input).toCharArray();

        int curSum = 0;
        int sign = 1;
        int i = 0;

        if (chars[0] == '-') {
            sign = -1;
            i++;
        }

        for (; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isDigit(c)) {
                curSum = curSum * 10 + toNumber(c);
            }
            else if (c == '.') {
                break;
            }
            else {
                throw new IllegalArgumentException("input contains non-valid characters: " + c);
            }
        }

        return curSum * sign;
    }

    private static int toNumber(char c) {
        return c - '0';
    }
}
