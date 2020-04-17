package methods;

import java.util.Scanner;

/**
 * Examples
 *
 * Input: "aa6?9"
 * Output: false
 *
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 */
public class QuestionsMarks {

    public static String QuestionsMarks(String str) {
        // code goes here
        String output = "false";
        boolean startDigit = false;
        int numStartDigit = -1;
        boolean endDigit = false;
        int numEndDigit = -1;
        int countQuestMarks = 0;
        int startIndex = -1;
        boolean lockStartDigit = false;

        for(int i = 0; i < str.length(); i++) {
            if(!lockStartDigit && Character.getNumericValue(str.charAt(i))>=0 && Character.getNumericValue(str.charAt(i))<10) {
                numStartDigit = Character.getNumericValue(str.charAt(i));
                if(startIndex==-1) {
                    startIndex = i;
                    System.out.println("startIndex: " + startIndex + "  numStartDigit: " + numStartDigit);
                }
                startDigit = true;
                lockStartDigit = true;
            }
            if(Character.getNumericValue(str.charAt(i))==-1) {
                if(startDigit)
                    countQuestMarks += 1;
            }
            if((i>startIndex) && startDigit && (Character.getNumericValue(str.charAt(i))>=0 && Character.getNumericValue(str.charAt(i))<10)) {
                endDigit = true;
                numEndDigit = Character.getNumericValue(str.charAt(i));
            }
            if(endDigit && (countQuestMarks>2) && numStartDigit + numEndDigit == 10)
                output = "true";
        }
        return output;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(QuestionsMarks(s.nextLine()));
    }

}
