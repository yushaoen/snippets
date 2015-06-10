/**
 * To rotate a string left/right by X characters. For example,
 * <p>
 * "abcd" -> rotate left by 1 characters -> "bcda"
 * "abcd" -> rotate right by 1 characters -> "dabc"
 * <p>
 * Usage:
 * <p>
 * StringRotator.rotateLeft("abcd", 1);
 * <p>
 * StringRotator.rotateRight("abcd", 1);
 * <p>
 * Created by yushaoen on 6/7/2015.
 */
public class StringRotator {
    /**
     * Return a string rotated left by X characters given the input string
     *
     * @param input       The original string
     * @param rotateTimes Number of characters to rotate the string
     * @return A new rotated string
     */
    public static String rotateLeft(String input, int rotateTimes) {
        return rotate(input, rotateTimes);
    }

    /**
     * Return a string rotated right by X characters given the input string
     *
     * @param input       The original string
     * @param rotateTimes Number of characters to rotate the string
     * @return A new rotated string
     */
    public static String rotateRight(String input, int rotateTimes) {
        return rotate(input, -1 * rotateTimes);
    }

    /**
     * Given an input string, rotate it left by X characters if given a positive
     * number and rotate right if given a negative number
     * <p>
     * The algorithm for the actual rotation is by splitting the string
     * into 2 parts based on where the beginning character and the end of the string
     * meets. Reverse both strings then combine. After it, reverse the new combined
     * string as the final result.
     * <p>
     * For example: To rotate "abcde" left by 2 characters:
     * <p>
     * 1. split the string into: "ab", "cde"
     * 2. reverse both parts separately: "ba", "edc"
     * 3. combine them: "baedc"
     * 4. reverse the combined string as the result: "cdeab"
     *
     * @param input       The original string
     * @param rotateTimes Number of characters to rotate the string
     * @return A new rotated string
     */
    private static String rotate(String input, int rotateTimes) {

        // If input is empty, simply return it
        if (input != null && input.length() > 0) {

            // Since rotating the string by its length will wrap
            // around and give the same string, simply use the
            // remainder of rotating times and the string length
            rotateTimes = rotateTimes % input.length();

            // Rotating left and right will give the same result
            // as long as the end and the beginning of the string
            // meets at the same location. Therefore, find where
            // they meet from the beginning:
            // - if the remainder is positive, it is the right position
            // - if negative, add it with the length to give
            //   the position counting from the left
            rotateTimes = (rotateTimes > 0) ? rotateTimes : input.length() + rotateTimes;

            // divide the string based on the position
            String part1 = input.substring(0, rotateTimes);
            String part2 = input.substring(rotateTimes);

            // Reverse the 2 parts, combine, then reverse it again
            return reverse(reverse(part1) + reverse(part2));
        } else {
            return input;
        }
    }

    /**
     * A helper method to help reverse a string
     *
     * How it works:
     * 1. points to the beginning character and the end and swap them;
     * 2. move to the adjacent ones and swap again
     * 3. iterate until the two pointers meet in the middle
     *
     * @param input     string to be reversed
     * @return          a new string reversed
     */
    public static String reverse(String input) {
        char[] array = input.toCharArray();
        char tmp;

        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        return String.valueOf(array);
    }
}
