package concepts.string;

import org.apache.commons.lang.StringUtils;

/**
 * @author yushaoen
 */
public class Atof {
    private Atof() {

    }

    public static double execute(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        if (StringUtils.countMatches(input, ".") > 1) {
            throw new IllegalArgumentException("input contains more than 1 dot");
        }

        char[] chars = StringUtils.trim(input).toCharArray();

        double curSum = 0;
        int sign = 1;
        int i = 0;
        int awayFromDot = 0;

        if (chars[0] == '-') {
            sign = -1;
            i++;
        }

        for (; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isDigit(c)) {
                if (awayFromDot > 0) {
                    curSum = curSum + Math.pow(10, -awayFromDot++) * toNumber(c);
                }
                else {
                    curSum = curSum * 10 + toNumber(c);
                }
            }
            else if (c == '.') {
                awayFromDot++;
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
