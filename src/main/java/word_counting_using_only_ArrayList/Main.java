package word_counting_using_only_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String initialSentence
                = "Hello I love Boston. Yes, you do Love Boston.";
        String[] initialWordsInArray = initialSentence.split("[, ?.@]+");
        List<String> initialWords =
                new ArrayList<String>(Arrays.asList(initialWordsInArray));

        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counters = new ArrayList<>();

        int currentIndex = 0;
        for (String word: initialWords){

            int foundIndex = isThisWordAlreadyFound(
                    uniqueWords,
                    word);

            // if the word has been already encountered
            if (foundIndex >= 0) {
                counters.set(foundIndex, counters.get(foundIndex)+1);
            }
            // else - this is the first the word is encountered
            else {
                int index = uniqueWords.size();
                uniqueWords.add(index,  word);
                counters.add(index, 0);
            }
        }

        // display the result
        System.out.println(uniqueWords);

    }

    // return -1 if the word is not encountered before
    // otherwise return the index in the uniqueWords array
    private static int isThisWordAlreadyFound(
            List<String> uniqueWords, String word) {
        return uniqueWords.indexOf(word);
    }
}
