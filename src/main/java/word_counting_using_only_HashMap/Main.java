package word_counting_using_only_HashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String initialSentence
                = "Hello I love Boston. Yes, you do Love Boston.";
        String[] initialWordsInArray = initialSentence.split("[, ?.@]+");
        List<String> initialWords =
                new ArrayList<String>(Arrays.asList(initialWordsInArray));

        HashMap<String, Integer> uniqueWordsMap = new HashMap<>();

        for (String word: initialWords){

            String lowerCasedWord = word.toLowerCase();
            Integer foundIndex = isThisWordAlreadyFound(
                    uniqueWordsMap,
                    lowerCasedWord);

            // if the word has been already encountered
            if (foundIndex != null) {
                uniqueWordsMap.replace(lowerCasedWord,
                        uniqueWordsMap.get(lowerCasedWord) + 1);
            }
            // else - this is the first the word is encountered
            else {
                uniqueWordsMap.put(lowerCasedWord, 1);
            }
        }

        // display the result
        System.out.println(uniqueWordsMap);

    }

    private static Integer isThisWordAlreadyFound(
            Map<String, Integer> uniqueWordsMap, String word) {
        return uniqueWordsMap.get(word);
    }
}
