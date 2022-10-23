package lab6_1_extra_exercises;

public class VarArgsCaller {
    public static void main(String[] args) {
        ArrayExample
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Dan");
        System.out.println();
        ArrayExample
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Dan", "Fred");
        System.out.println();
        ArrayExample
                .convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Dan", "Fred", "Kiaya");
    }
}

