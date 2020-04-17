package methods;

import java.util.*;
import java.io.*;

/**
 * First Reverse
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed
 * order. For example: if the input string is "Hello World and Coders" then your program should return
 * the string sredoC dna dlroW olleH.
 *
 * Examples
 * Input: "coderbyte"
 * Output: etybredoc
 *
 * Input: "I Love Code"
 * Output: edoC evoL I
 */
public class FirstReverse {

        public static String FirstReverse(String str) {
            // code goes here
            StringBuilder sb = new StringBuilder(str).reverse();
            return sb.toString();
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(FirstReverse(s.nextLine()));
        }

    }
