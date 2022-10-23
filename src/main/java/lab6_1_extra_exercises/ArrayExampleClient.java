package lab6_1_extra_exercises;

import java.util.Arrays;

public class ArrayExampleClient {

    public static void main(String[] args) {

        // exercise #1
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.convertAndDisplayNamesToUpperCase();

        // exercise #2
        int[] testNumberArray = {8, 3, 2, 1, 4, 5, 6, 10, 8, 2, 3};
        int[] oddNumbersFromArray
                = ArrayExample.findOddNumbersFromArray(testNumberArray);
        System.out.println(Arrays.toString(oddNumbersFromArray));

        // exercise #3
        int largestNumberFromArray
                = ArrayExample.findLargestNumberFromArray(testNumberArray);
        System.out.println(largestNumberFromArray);
    }
}
