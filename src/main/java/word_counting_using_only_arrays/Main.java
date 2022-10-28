package word_counting_using_only_arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String initialSentence
                = "Hello I love Boston. Yes, you do Love Boston.";
        String[] initialWords = initialSentence.split("[, ?.@]+");

        String[] uniqueWords = new String[initialWords.length];
        int[] counters = new int[initialWords.length];
        int currentIndex = 0;

        for (int i = 0; i < initialWords.length; i++) {

            // if initialWords[i] has been already encountered before
            //   - then I need to know the index of the
            //     location where the previous word is located
            //     in the uniqueWords array
            //   - and increment the counter in the counters array
            //     with the same index
            // else
            //   - use currentIndex to uniqueWords[currentIndex] = initialWords[i]
            //   - counters[currentIndex] = 1
            //   - increment the currentIndex by 1
            String initialWord = initialWords[i];
            int foundIndex = isThisWordAlreadyFound(
                    uniqueWords,
                    initialWord,
                    currentIndex);

            // if the word has been already encountered
            if (foundIndex >= 0) {
                counters[foundIndex]++;
            }
            // else - this is the first time the word is encountered
            else {
                uniqueWords[currentIndex] = initialWord;
                counters[currentIndex] = 1;
                currentIndex++;
            }
        }

        // display the result
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(uniqueWords[i] + ": " + counters[i]);
            System.out.println();
        }

    }

    // return -1 if the word is not encountered before
    // otherwise return the index in the uniqueWords array
    private static int isThisWordAlreadyFound(
            String[] uniqueWords, String initialWord, int currentIndex) {
        int foundIndex = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (uniqueWords[i].equalsIgnoreCase(initialWord)) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }
}
