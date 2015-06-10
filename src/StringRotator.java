/**
 * Created by yushaoen on 6/7/2015.
 */
public class StringRotator {
    public static String rotateLeft(String input, int rotateTimes) {
        return rotate(input, rotateTimes);
    }

    public static String rotateRight(String input, int rotateTimes) {
        return rotate(input, -1 * rotateTimes);
    }

    public static String rotate(String input, int rotateTimes) {

        if (input != null && input.length() > 0) {

            rotateTimes = rotateTimes % input.length();

            rotateTimes = (rotateTimes > 0) ? rotateTimes : input.length() + rotateTimes;

            String part1 = input.substring(0, rotateTimes);
            String part2 = input.substring(rotateTimes);

            StringBuilder builder = new StringBuilder();

            builder.append(reverse(part1));
            builder.append(reverse(part2));

            return reverse(builder.toString());
        } else {
            return input;
        }
    }

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
