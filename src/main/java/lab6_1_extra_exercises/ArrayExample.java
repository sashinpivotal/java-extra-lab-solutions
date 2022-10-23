package lab6_1_extra_exercises;

public class ArrayExample {

    private String[] familyNames = {"Bryce", "Cameron", "Alex"};

    // exercise #1
    public void convertAndDisplayNamesToUpperCase() {
        for (int i = 0; i < familyNames.length; i++) {
            System.out.println(familyNames[i].toUpperCase());
        }
    }

    // exercise #2
    public static int[] findOddNumbersFromArray(int[] numbers) {
        int[] oddNumbersTemp = new int[numbers.length];
        int currentIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddNumbersTemp[currentIndex++] = numbers[i];
            }
        }

        return removeTrailingZeros(oddNumbersTemp);
    }

    private static int[] removeTrailingZeros(int[] oddNumbersTemp) {

        // figure out the size of the required int array
        int lengthOfValidOddNumbers = 0;
        for (int i = 0; i < oddNumbersTemp.length; i++) {
            if (oddNumbersTemp[i] > 0) {
                lengthOfValidOddNumbers++;
            }
        }

        int[] oddNumbers = new int[lengthOfValidOddNumbers];
        for (int i = 0; i < lengthOfValidOddNumbers; i++) {
            oddNumbers[i] = oddNumbersTemp[i];
        }
        return oddNumbers;
    }

    // exercise #3
    public static int findLargestNumberFromArray(int[] numbers) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    // exercise #4
    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String... myFriends) {
        String[] friends = myFriends;
        for (String friend : friends) {
            System.out.print(friend.toUpperCase() + " ");
        }
    }

}

