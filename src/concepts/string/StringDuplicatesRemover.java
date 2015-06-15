package concepts.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yushaoen
 */
public class StringDuplicatesRemover {
    /**
     * Remove all duplicate words from the string in place
     *
     * @param input the original string containing duplicates
     * @return the new string length
     */
    public static int prune(char[] input) {
        /**
         * Record all occurrences of words
         */
        Set<String> dictionary = new HashSet<>();

        /**
         * Index where the remaining of unchecked string starts
         */
        int remaining = 0;

        /**
         * Index of where the checked string ends
         */
        int written = 0;

        /**
         * Information about a word such its start and end indices
         */
        WordLocation wordLocation;

        if (input.length > 0) {
            while ((wordLocation = getNextWordLocation(input, remaining)) != null) {
                // If the word is not an duplicate, move the word up
                // right behind where the last non-duplicate word is.
                // Else, move on to the next word
                if (!dictionary.contains(wordLocation.word)) {
                    dictionary.add(wordLocation.word);
                    written = moveWord(input, wordLocation, written);
                }
                remaining = wordLocation.end + 2;
            }
        }

        return written;
    }

    private static final class WordLocation {
        public int start;
        public int end;
        public String word;

        public WordLocation(char[] input, int start, int end) {
            this.start = start;
            this.end = end;
            this.word = String.valueOf(input, start, end - start + 1);
        }
    }

    private static WordLocation getNextWordLocation(char[] input, int startIndex) {
        int i = startIndex;
        for (; i < input.length; i++) {
            if (!Character.isLetter(input[i])) {
                return new WordLocation(input, startIndex, i - 1);
            }
        }

        return (startIndex != i) ? new WordLocation(input, startIndex, i - 1) : null;
    }

    private static int moveWord(char[] input, WordLocation wordLocation, int startIndex) {
        int length = wordLocation.word.length();

        if (wordLocation.end < input.length - 1) {
            length++;
        }

        System.arraycopy(input, wordLocation.start, input, startIndex, length);

        return startIndex + length;
    }
}
