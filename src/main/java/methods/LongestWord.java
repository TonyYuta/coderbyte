package methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Longest Word
 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word
 * in the string. If there are two or more words that are the same length, return the first word from
 * the string with that length. Ignore punctuation and assume sen will not be empty.
 * Examples
 * Input: "fun&!! time"
 * Output: time
 * Input: "I love dogs"
 * Output: love
 */
public class LongestWord {

    public static String LongestWord(String sen) {
        // code goes here
        int maxLength = 0;
        String longestWord = "";
        String[] wordsArr = sen.replaceAll("[\\.$|,|;|'&*^%$#@`~\\|/<>?!]", "").toLowerCase().split(" ");
        for(String word : wordsArr) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
