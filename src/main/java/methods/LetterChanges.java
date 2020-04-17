package methods;

import java.util.Scanner;

/**
 * Letter Changes
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following
 * algorithm. Replace every letter in the string with the letter following it in the alphabet
 * (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally
 * return this modified string.
 * Examples
 * Input: "hello*3"
 * Output: Ifmmp*3
 * Input: "fun times!"
 * Output: gvO Ujnft!
 *
 * A 65
 * Z 90
 * A 65
 * a 97
 * z 122
 * exclude 91 - 96
 * a, e, i, o, u:
 * a 97 -> 65
 * e 101 -> 69
 * -32
 */
public class LetterChanges {

    public static String LetterChanges(String str) {
        // code goes here
        String lowerCaseStr = str.toLowerCase();
        String result = "";
        for(int i = 0; i < lowerCaseStr.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                if (lowerCaseStr.charAt(i) >= 97 && lowerCaseStr.charAt(i) < 122) {
                    int intC = (char) (lowerCaseStr.charAt(i)) + 1;
                    char cc = (char) intC;
                    result += cc;
                } else if (lowerCaseStr.charAt(i) == 'z') {
                    result += "a";
                }
            } else
                result += lowerCaseStr.charAt(i);
        }
        String res = "";
        for(int i = 0; i < result.length(); i++) {
            if(
                    result.charAt(i) == 'a' ||
                    result.charAt(i) == 'e' ||
                    result.charAt(i) == 'i' ||
                    result.charAt(i) == 'o' ||
                    result.charAt(i) == 'u'
            ) {
                int intVov = (char) (result.charAt(i)) - 32;
                char cc = (char) intVov;
                res += cc;
            } else
                res += result.charAt(i);
        }
        return res;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}
