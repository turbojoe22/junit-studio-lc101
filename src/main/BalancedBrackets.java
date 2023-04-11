package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        Boolean answer = brackets == 0;
        ArrayList<String> leftBracketHolder = new ArrayList<String>();
        for (char ch : str.toCharArray()){
            if(char ch == "["){
            }
        }
    }
}
// YOU"RE MAKING A CHAR ARRAY FOR [, THEN CONVERTING TYPE TO STR FOR THE ARRAYLIST
// EVERY ] POPS THE LAST ITEM IN THE ARRAYLIST. IF THERES NOTHING IN THE ARRAY RETURN
// FALSE INSTEAD OF POPPING. RETURN FALSE IF THERES ANYTHING IN THE ARRAYLIST, ELSE
// RETURN TRUE